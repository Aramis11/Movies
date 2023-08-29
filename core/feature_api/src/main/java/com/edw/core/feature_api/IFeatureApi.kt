package com.edw.core.feature_api

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

interface IFeatureApi {

    fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    )
}