package com.edw.feature.movie_details.ui.di

import com.edw.feature.movie_details.ui.navigation.IMovieDetailsApi
import com.edw.feature.movie_details.ui.navigation.MovieDetailsApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UiModel {

    @Provides
    fun provideMovieDetailsApi(): IMovieDetailsApi {
        return  MovieDetailsApiImpl()
    }
}