package com.edw.feature.movie.data.mapper

import com.edw.core.network.model.MovieListResponse
import com.edw.feature.movie.domain.model.Movie

fun MovieListResponse.toDomainMovieList(): List<Movie> {
    return this.results.map {
        Movie(it.poster_path)
    }
}