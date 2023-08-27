package com.edw.feature.movie.domain.use_cases

import com.edw.core.common.UiEvent
import com.edw.feature.movie.domain.reposiroty.IMovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetMovieListUseCase @Inject constructor(private val movieRepository: IMovieRepository) {
    operator fun invoke(movieName: String) = flow {
        emit(UiEvent.Loading())
        emit(UiEvent.Success(movieRepository.getMovieList(movieName)))
    }.catch {
        emit(UiEvent.Error(it.message.toString()))
    }.flowOn(Dispatchers.IO)
}