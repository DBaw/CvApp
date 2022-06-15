package com.example.cvapp.navigation

const val NAV_GRAPH_ROUTE = "nav_root"
const val HOME_GRAPH_ROUTE = "home_root"
const val CV_GRAPH_ROUTE = "cv_root"
const val CONTACT_GRAPH_ROUTE = "contact_root"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Contact : Screen(route = "contact_screen")

    object Cv : Screen(route = "cv_screen")
    object Info : Screen(route = "info_screen")
    object Education : Screen(route = "edu_screen")
    object Experience : Screen(route = "exp_screen")
    object Skills : Screen(route = "skills_screen")
    object Interests : Screen(route = "interests_screen")}
