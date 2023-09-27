package com.edw.core.network.dataproviders

import com.edw.core.network.ApiService
import javax.inject.Inject

class MovieDataProvider @Inject constructor(private val apiService: ApiService) {
    suspend fun getMovieList(movieName: String) = apiService.getMovieList(movieName)

    suspend fun getMovieDetails(id: String) = apiService.getMovieDetails(id)
}