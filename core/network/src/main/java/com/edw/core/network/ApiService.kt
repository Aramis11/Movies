package com.edw.core.network

import com.edw.core.network.model.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    //https://api.themoviedb.org/3/search/movie?api_key=de0a3c4d0726ba91bb86e2e950a2e99b&query=Harry
    @GET("3/search/movie")
    suspend fun getMovieList(
        @Query("api_key") apiKey: String,
        @Query("query") movie: String
    ): MovieListResponse
}