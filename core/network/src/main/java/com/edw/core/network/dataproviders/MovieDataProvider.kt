package com.edw.core.network.dataproviders

import com.edw.core.network.ApiService
import javax.inject.Inject

class MovieDataProvider @Inject constructor(private val apiService: ApiService) {
    suspend fun getMovieList(apiKey: String, movie: String) = apiService.getMovieList(apiKey, movie)
}