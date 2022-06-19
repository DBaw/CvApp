package com.example.cvapp.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.cvapp.navigation.CONTACT_GRAPH_ROUTE
import com.example.cvapp.navigation.Screen
import com.example.cvapp.screens.ContactScreen

fun NavGraphBuilder.contactNavGraph(
) {
    navigation(
        startDestination = Screen.Contact.route,
        route = CONTACT_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Contact.route
        ) {
            ContactScreen()
        }
    }
}