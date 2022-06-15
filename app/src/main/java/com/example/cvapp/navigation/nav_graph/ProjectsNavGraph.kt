package com.example.cvapp.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.cvapp.navigation.PROJECTS_GRAPH_ROUTE
import com.example.cvapp.navigation.Screen

fun NavGraphBuilder.projectsNavGraph(
) {
    navigation(
        startDestination = Screen.Projects.route,
        route = PROJECTS_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Projects.route
        ) {

        }
    }
}