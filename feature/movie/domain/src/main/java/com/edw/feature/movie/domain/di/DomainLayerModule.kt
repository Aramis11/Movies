package com.edw.feature.movie.domain.di

import com.edw.feature.movie.domain.reposiroty.IMovieRepository
import com.edw.feature.movie.domain.use_cases.GetMovieListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainLayerModule {

    @Provides
    fun provideGetMovieListUseCase(movieRepository: IMovieRepository): GetMovieListUseCase{
        return  GetMovieListUseCase(movieRepository)
    }

}