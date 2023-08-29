package com.edw.feature.movie.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

class MovieApiImpl : IMovieApi {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalMovieFeatureApi.registerGraph(
            navController,
            navGraphBuilder
        )
    }
}