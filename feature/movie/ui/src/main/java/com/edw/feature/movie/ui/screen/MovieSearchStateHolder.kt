package com.edw.feature.movie.ui.screen

import com.edw.feature.movie.domain.model.Movie

data class MovieSearchStateHolder(
    val isLoading: Boolean = false,
    val data: List<Movie>? = null,
    val error: String = ""
)
