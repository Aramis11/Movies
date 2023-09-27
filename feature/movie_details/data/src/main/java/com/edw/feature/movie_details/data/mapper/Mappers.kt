package com.edw.feature.movie_details.data.mapper

import com.edw.core.network.model.MovieDetailsDTO
import com.edw.feature.movie_details.domain.model.MovieDetails

fun MovieDetailsDTO.toDomain(): MovieDetails {
    return MovieDetails(
        title = this.original_title,
        description = this.overview,
        imageURL = makeUrl(this.poster_path)
    )
}

fun makeUrl(path: String) = "https://image.tmdb.org/t/p/w500/$path"