package com.edw.movie.di

import com.edw.feature.movie.ui.navigation.IMovieApi
import com.edw.movie.navigation.NavigationProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideNavigationProvider(movieApi: IMovieApi): NavigationProvider {
        return  NavigationProvider(movieApi)
    }
}