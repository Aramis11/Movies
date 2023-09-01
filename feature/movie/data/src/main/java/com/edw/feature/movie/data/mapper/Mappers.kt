package com.edw.feature.movie.data.mapper

import com.edw.core.network.model.MovieListResponse
import com.edw.feature.movie.domain.model.Movie

fun MovieListResponse.toDomainMovieList(): List<Movie> {
    return this.results.map {
        Movie(makeUrl(it.poster_path))
    }
}

fun makeUrl(path: String) = "https://image.tmdb.org/t/p/w500/$path"