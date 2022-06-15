package com.example.cvapp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.cvapp.navigation.HOME_GRAPH_ROUTE
import com.example.cvapp.navigation.NAV_GRAPH_ROUTE
import com.example.cvapp.navigation.nav_graph.*


@ExperimentalFoundationApi
@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE,
        route = NAV_GRAPH_ROUTE
    ) {
        cvNavGraph(navController = navController)
        homeNavGraph()
        contactNavGraph()
    }
}