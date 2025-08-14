package com.kinudev.myapplication.feature.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    composable(route = "home") {
        HomeScreen()
    }
}