package com.edw.feature.movie_details.ui.screen

import com.edw.feature.movie_details.domain.model.MovieDetails

data class MovieDetailStateHolder(
    val isLoading: Boolean = false,
    val data: MovieDetails? = null,
    val error: String = ""
)
