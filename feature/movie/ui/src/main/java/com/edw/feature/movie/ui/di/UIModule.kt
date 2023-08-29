package com.edw.feature.movie.ui.di

import com.edw.feature.movie.ui.navigation.IMovieApi
import com.edw.feature.movie.ui.navigation.MovieApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UIModule {

    @Provides
    fun provideMovieApi(): IMovieApi {
        return  MovieApiImpl()
    }

}