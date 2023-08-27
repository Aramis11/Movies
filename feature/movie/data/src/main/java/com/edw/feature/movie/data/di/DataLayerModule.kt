package com.edw.feature.movie.data.di

import com.edw.core.network.dataproviders.MovieDataProvider
import com.edw.feature.movie.data.repository.MovieRepositoryImpl
import com.edw.feature.movie.domain.reposiroty.IMovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DataLayerModule {

    @Provides
    fun provideMovieRepository(movieDataProvider: MovieDataProvider): IMovieRepository {
        return MovieRepositoryImpl(movieDataProvider)
    }
}