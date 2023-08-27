package com.edw.core.network.di

import com.edw.core.network.ApiKeyHeaderInterceptor
import com.edw.core.network.ApiService
import com.edw.core.network.dataproviders.MovieDataProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Provides
    fun provideApiService(): ApiService {

        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org")
            .client(OkHttpClient.Builder().addInterceptor(ApiKeyHeaderInterceptor()).build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }

    @Provides
    fun provideMovieDataProvider(apiService: ApiService): MovieDataProvider {
        return MovieDataProvider(apiService)
    }
}