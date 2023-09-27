package com.edw.feature.movie_details.ui.screen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.edw.core.common.UiEvent
import com.edw.feature.movie_details.domain.use_cases.GetMovieDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MovieDetailViewModel @Inject constructor(
    private val getMovieDetailUseCase: GetMovieDetailUseCase,
    savedStateHandle: SavedStateHandle
) :
    ViewModel() {

    private val _movieDetails = mutableStateOf(MovieDetailStateHolder())
    val movieDetails: State<MovieDetailStateHolder> get() = _movieDetails

    init {
        savedStateHandle.getLiveData<String>("id").observeForever {
            it?.let {
                getMovieDetails(it)
            }
        }
    }

    fun getMovieDetails(id: String) {
        getMovieDetailUseCase(id).onEach {
            when (it) {
                is UiEvent.Error -> {
                    _movieDetails.value = MovieDetailStateHolder(error = it.message.toString())
                }

                is UiEvent.Loading -> {
                    _movieDetails.value = MovieDetailStateHolder(isLoading = true)
                }

                is UiEvent.Success -> {
                    _movieDetails.value = MovieDetailStateHolder(data = it.data)
                }
            }

        }.launchIn(viewModelScope)
    }

}