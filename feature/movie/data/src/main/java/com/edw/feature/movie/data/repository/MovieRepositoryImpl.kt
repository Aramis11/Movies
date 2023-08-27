package com.edw.feature.movie.data.repository

import com.edw.core.network.dataproviders.MovieDataProvider
import com.edw.feature.movie.data.mapper.toDomainMovieList
import com.edw.feature.movie.domain.model.Movie
import com.edw.feature.movie.domain.reposiroty.IMovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val movieDataProvider: MovieDataProvider) :
    IMovieRepository {
    override suspend fun getMovieList(apiKey: String, movieName: String): List<Movie> {
        return movieDataProvider.getMovieList(apiKey, movieName).toDomainMovieList()
    }
}