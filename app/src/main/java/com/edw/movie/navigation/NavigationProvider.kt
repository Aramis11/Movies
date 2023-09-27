package com.edw.movie.navigation

import com.edw.feature.movie.ui.navigation.IMovieApi
import com.edw.feature.movie_details.ui.navigation.IMovieDetailsApi

data class NavigationProvider(val movieApi: IMovieApi, val movieDetailsApi: IMovieDetailsApi)
