package com.edw.feature.movie.ui.screen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.edw.core.common.UiEvent
import com.edw.feature.movie.domain.use_cases.GetMovieListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieSearchViewModel @Inject constructor(private val getMovieListUseCase: GetMovieListUseCase) :
    ViewModel() {

    private val _movieList = mutableStateOf(MovieSearchStateHolder())
    val movieList: State<MovieSearchStateHolder> get() = _movieList

    private val _movieName: MutableStateFlow<String> = MutableStateFlow("")
    val movieName: StateFlow<String> get() = _movieName

    fun setMovie(movieName: String) {
        _movieName.value = movieName
    }

    init {
        viewModelScope.launch {
            _movieName.debounce(1000).collectLatest {
                getMovieList(it)
            }
        }
    }

    private fun getMovieList(movieName: String) = viewModelScope.launch {
        getMovieListUseCase(movieName).onEach {
            when (it) {
                is UiEvent.Loading -> {
                    _movieList.value = MovieSearchStateHolder(isLoading = true)
                }

                is UiEvent.Error -> {
                    _movieList.value = MovieSearchStateHolder(error = it.message.toString())
                }

                is UiEvent.Success -> {
                    _movieList.value = MovieSearchStateHolder(data = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }
}