package com.edw.feature.movie.domain.reposiroty

import com.edw.feature.movie.domain.model.Movie

interface IMovieRepository {
    suspend fun getMovieList(movieName: String) : List<Movie>

}