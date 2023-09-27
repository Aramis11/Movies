package com.edw.core.network

import com.edw.core.network.model.MovieDetailsDTO
import com.edw.core.network.model.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("3/search/movie")
    suspend fun getMovieList(
        @Query("query") movie: String
    ): MovieListResponse

    @GET("3/movie/{id}")
    suspend fun getMovieDetails(
        @Path("id") id: String
    ) : MovieDetailsDTO
}