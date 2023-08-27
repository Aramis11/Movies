package com.edw.feature.movie.domain.reposiroty

import com.edw.feature.movie.domain.model.Movie

interface IMovieRepository {
    suspend fun getMovieList(apiKey: String, movieName: String) : List<Movie>

}