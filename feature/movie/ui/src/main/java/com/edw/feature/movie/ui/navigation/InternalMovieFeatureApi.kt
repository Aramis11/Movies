package com.edw.feature.movie.ui.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.edw.core.common.navigation_constants.MovieFeature
import com.edw.core.feature_api.IFeatureApi
import com.edw.feature.movie.ui.screen.MovieScreen
import com.edw.feature.movie.ui.screen.MovieSearchViewModel

internal object InternalMovieFeatureApi : IFeatureApi {
    override fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation(
            startDestination = MovieFeature.movieScreenRoute,
            route = MovieFeature.nestedRoute
        ) {
            composable(MovieFeature.movieScreenRoute) {
                MovieScreen(viewModel = hiltViewModel<MovieSearchViewModel>(), navController)
            }
        }
    }
}