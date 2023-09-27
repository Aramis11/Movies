package com.edw.feature.movie_details.data.di

import com.edw.core.network.dataproviders.MovieDataProvider
import com.edw.feature.movie_details.data.repository.MovieDetailsRepositoryImpl
import com.edw.feature.movie_details.domain.repository.MovieDetailsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Provides
    fun provideMovieDetailRepository(movieDataProvider: MovieDataProvider): MovieDetailsRepository {
        return MovieDetailsRepositoryImpl(movieDataProvider)
    }
}