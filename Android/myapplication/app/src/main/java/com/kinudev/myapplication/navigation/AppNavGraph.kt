package com.kinudev.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.kinudev.myapplication.feature.home.homeNavGraph
import com.kinudev.myapplication.feature.profile.profileNavGraph

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "home") {
        homeNavGraph(navController)
        profileNavGraph(navController)
    }
}