package com.edw.feature.movie_details.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

class MovieDetailsApiImpl : IMovieDetailsApi {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalMovieDetailsApi.registerGraph(navController, navGraphBuilder)
    }
}