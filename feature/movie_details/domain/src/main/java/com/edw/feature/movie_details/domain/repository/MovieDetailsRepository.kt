package com.edw.feature.movie_details.domain.repository

import com.edw.feature.movie_details.domain.model.MovieDetails

interface MovieDetailsRepository {

    suspend fun getMovieDetails(id: String) : MovieDetails

}