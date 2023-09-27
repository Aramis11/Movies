package com.edw.feature.movie_details.data.repository

import com.edw.core.network.dataproviders.MovieDataProvider
import com.edw.feature.movie_details.data.mapper.toDomain
import com.edw.feature.movie_details.domain.model.MovieDetails
import com.edw.feature.movie_details.domain.repository.MovieDetailsRepository
import javax.inject.Inject

class MovieDetailsRepositoryImpl @Inject constructor(private val movieDataProvider: MovieDataProvider) :
    MovieDetailsRepository {
    override suspend fun getMovieDetails(id: String): MovieDetails {
        return movieDataProvider.getMovieDetails(id).toDomain()
    }
}