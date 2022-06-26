package com.example.cvapp.navigation.nav_graph

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
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
                        lightColor = if(!isSystemInDarkTheme()) LightModeFirstLightFeatureColor else DarkModeFirstLightFeatureColor,
                        mediumColor = if(!isSystemInDarkTheme()) LightModeFirstFeatureColor else DarkModeFirstFeatureColor,
                        darkColor = if(!isSystemInDarkTheme()) LightModeFirstDarkFeatureColor else DarkModeFirstDarkFeatureColor,
                        route = Screen.Info.route
                    ),
                        Feature(
                            title = "Experience",
                            icon = Icons.Default.Work,
                            lightColor = if(!isSystemInDarkTheme()) LightModeFirstLightFeatureColor else DarkModeFirstLightFeatureColor,
                            mediumColor = if(!isSystemInDarkTheme()) LightModeFirstFeatureColor else DarkModeFirstFeatureColor,
                            darkColor = if(!isSystemInDarkTheme()) LightModeFirstDarkFeatureColor else DarkModeFirstDarkFeatureColor,
                            route = Screen.Experience.route
                        ),

                        Feature(
                            title = "Education",
                            icon = Icons.Default.School,
                            lightColor = if(!isSystemInDarkTheme()) LightModeSecondLightFeatureColor else DarkModeSecondLightFeatureColor,
                            mediumColor = if(!isSystemInDarkTheme()) LightModeSecondFeatureColor else DarkModeSecondFeatureColor,
                            darkColor = if(!isSystemInDarkTheme()) LightModeSecondDarkFeatureColor else DarkModeSecondDarkFeatureColor,
                            route = Screen.Education.route
                        ),

                        Feature(
                            title = "Skills",
                            icon = Icons.Default.Star,
                            lightColor = if(!isSystemInDarkTheme()) LightModeSecondLightFeatureColor else DarkModeSecondLightFeatureColor,
                            mediumColor = if(!isSystemInDarkTheme()) LightModeSecondFeatureColor else DarkModeSecondFeatureColor,
                            darkColor = if(!isSystemInDarkTheme()) LightModeSecondDarkFeatureColor else DarkModeSecondDarkFeatureColor,
                            route = Screen.Skills.route
                        ),

                        Feature(
                            title = "Interests",
                            icon = Icons.Default.Favorite ,
                            lightColor = if(!isSystemInDarkTheme()) LightModeThirdLightFeatureColor else DarkModeThirdLightFeatureColor,
                            mediumColor = if(!isSystemInDarkTheme()) LightModeThirdFeatureColor else DarkModeThirdFeatureColor,
                            darkColor = if(!isSystemInDarkTheme()) LightModeThirdDarkFeatureColor else DarkModeThirdDarkFeatureColor,
                            route = Screen.Interests.route
                        ),

                        Feature(
                            title = "Contact",
                            icon = Icons.Default.ContactPhone,
                            lightColor = if(!isSystemInDarkTheme()) LightModeThirdLightFeatureColor else DarkModeThirdLightFeatureColor,
                            mediumColor = if(!isSystemInDarkTheme()) LightModeThirdFeatureColor else DarkModeThirdFeatureColor,
                            darkColor = if(!isSystemInDarkTheme()) LightModeThirdDarkFeatureColor else DarkModeThirdDarkFeatureColor,
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