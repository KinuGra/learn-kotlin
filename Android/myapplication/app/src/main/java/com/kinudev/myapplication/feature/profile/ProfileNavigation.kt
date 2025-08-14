package com.kinudev.myapplication.feature.profile

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.profileNavGraph(navController: NavController) {
    composable(route = "profile") {
        ProfileScreen(onBack = {navController.popBackStack()})
    }
}