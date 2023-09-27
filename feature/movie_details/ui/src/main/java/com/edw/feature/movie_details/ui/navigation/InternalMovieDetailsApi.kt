package com.edw.feature.movie_details.ui.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.edw.core.feature_api.IFeatureApi
import com.edw.core.common.navigation_constants.MovieDetailsFeature
import com.edw.feature.movie_details.ui.screen.MovieDetailViewModel
import com.edw.feature.movie_details.ui.screen.MovieDetailsScreen

object InternalMovieDetailsApi : IFeatureApi {
    override fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation(
            startDestination = MovieDetailsFeature.movieDetailsScreenRoute,
            route = MovieDetailsFeature.nestedRoute
        ) {
            composable(MovieDetailsFeature.movieDetailsScreenRoute) {
                val id = it.arguments?.getString("id")
                MovieDetailsScreen(
                    id = id.toString(),
                    viewModel = hiltViewModel<MovieDetailViewModel>()
                )
            }
        }
    }
}
