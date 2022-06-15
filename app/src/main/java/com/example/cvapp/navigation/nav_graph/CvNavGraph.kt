package com.example.cvapp.navigation.nav_graph

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.cvapp.R
import com.example.cvapp.CvScreen
import com.example.cvapp.InfoScreen
import com.example.cvapp.navigation.CV_GRAPH_ROUTE
import com.example.cvapp.navigation.Screen
import com.example.cvapp.screens.*
import com.example.cvapp.screens.data.Feature
import com.example.cvapp.ui.theme.*

@ExperimentalFoundationApi
fun NavGraphBuilder.cvNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Cv.route,
        route = CV_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Cv.route
        ) {
            CvScreen(navController = navController, features = listOf(

                    Feature(
                        title = "Info",
                        icon = Icons.Default.Info,
                        lightColor = LightExpColor,
                        mediumColor = ExpColor,
                        darkColor = DarkExpColor,
                        route = Screen.Info.route
                    ),
                        Feature(
                            title = "Experience",
                            icon = Icons.Default.Work,//painterResource(id = R.drawable.work),
                            lightColor = LightExpColor,
                            mediumColor = ExpColor,
                            darkColor = DarkExpColor,
                            route = Screen.Experience.route
                        ),

                        Feature(
                            title = "Education",
                            icon = Icons.Default.School,
                            lightColor = LightSkillColor,
                            mediumColor = SkillColor,
                            darkColor = DarkSkillColor,
                            route = Screen.Education.route
                        ),

                        Feature(
                            title = "Skills",
                            icon = Icons.Default.Star,
                            lightColor = LightSkillColor,
                            mediumColor = SkillColor,
                            darkColor = DarkSkillColor,
                            route = Screen.Skills.route
                        ),

                        Feature(
                            title = "Interests",
                            icon = Icons.Default.Favorite ,
                            lightColor = LightContactColor,
                            mediumColor = ContactColor,
                            darkColor = DarkContactColor,
                            route = Screen.Interests.route
                        ),

                        Feature(
                            title = "Contact",
                            icon = Icons.Default.ContactPhone,
                            lightColor = LightContactColor,
                            mediumColor = ContactColor,
                            darkColor = DarkContactColor,
                            route = Screen.Contact.route
                        )

            ))
        }
        composable(
            route = Screen.Info.route
        ) {
            InfoScreen()
        }
        composable(
            route = Screen.Education.route
        ) {
            EducationScreen()
        }
        composable(
            route = Screen.Experience.route
        ) {
            ExperienceScreen()
        }
        composable(
            route = Screen.Skills.route
        ) {
            SkillsScreen()
        }
        composable(
            route = Screen.Interests.route
        ) {
            InterestsScreen()
        }
    }
}