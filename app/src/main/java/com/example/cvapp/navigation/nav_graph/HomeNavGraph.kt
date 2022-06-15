package com.example.cvapp.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.cvapp.HomeScreen
import com.example.cvapp.navigation.HOME_GRAPH_ROUTE
import com.example.cvapp.navigation.Screen

fun NavGraphBuilder.homeNavGraph(
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen()
        }
    }
}