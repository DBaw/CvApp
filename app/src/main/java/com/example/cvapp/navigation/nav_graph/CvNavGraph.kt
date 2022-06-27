package com.example.cvapp.navigation.nav_graph

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ExperimentalMaterialApi
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
import com.example.cvapp.screens.data.SelectenScreen
import com.example.cvapp.ui.theme.*

@ExperimentalMaterialApi
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
                        unselectedLightColor = if(isSystemInDarkTheme()) unselectedFirstDarkMode else unselectedFirstLightMode,
                        unselectedMediumColor = if(isSystemInDarkTheme()) unselectedSecondDarkMode else unselectedSecondLightMode,
                        unselectedDarkColor = if(isSystemInDarkTheme()) unselectedThirdDarkMode else unselectedThirdLightMode,
                        selectedLightColor = if(isSystemInDarkTheme()) selectedFirstDarkMode else selectedFirstLightMode,
                        selectedMediumColor = if(isSystemInDarkTheme()) selectedSecondDarkMode else selectedSecondLightMode,
                        selectedDarkColor = if(isSystemInDarkTheme()) selectedThirdDarkMode else selectedThirdLightMode,
                        route = SelectenScreen.Inf.screen
                    ),
                        Feature(
                            title = "Experience",
                            icon = Icons.Default.Work,
                            unselectedLightColor = if(isSystemInDarkTheme()) unselectedFirstDarkMode else unselectedFirstLightMode,
                            unselectedMediumColor = if(isSystemInDarkTheme()) unselectedSecondDarkMode else unselectedSecondLightMode,
                            unselectedDarkColor = if(isSystemInDarkTheme()) unselectedThirdDarkMode else unselectedThirdLightMode,
                            selectedLightColor = if(isSystemInDarkTheme()) selectedFirstDarkMode else selectedFirstLightMode,
                            selectedMediumColor = if(isSystemInDarkTheme()) selectedSecondDarkMode else selectedSecondLightMode,
                            selectedDarkColor = if(isSystemInDarkTheme()) selectedThirdDarkMode else selectedThirdLightMode,
                            route = SelectenScreen.Exp.screen
                        ),

                        Feature(
                            title = "Education",
                            icon = Icons.Default.School,
                            unselectedLightColor = if(isSystemInDarkTheme()) unselectedFirstDarkMode else unselectedFirstLightMode,
                            unselectedMediumColor = if(isSystemInDarkTheme()) unselectedSecondDarkMode else unselectedSecondLightMode,
                            unselectedDarkColor = if(isSystemInDarkTheme()) unselectedThirdDarkMode else unselectedThirdLightMode,
                            selectedLightColor = if(isSystemInDarkTheme()) selectedFirstDarkMode else selectedFirstLightMode,
                            selectedMediumColor = if(isSystemInDarkTheme()) selectedSecondDarkMode else selectedSecondLightMode,
                            selectedDarkColor = if(isSystemInDarkTheme()) selectedThirdDarkMode else selectedThirdLightMode,
                            route = SelectenScreen.Edu.screen
                        ),

                        Feature(
                            title = "Skills",
                            icon = Icons.Default.Star,
                            unselectedLightColor = if(isSystemInDarkTheme()) unselectedFirstDarkMode else unselectedFirstLightMode,
                            unselectedMediumColor = if(isSystemInDarkTheme()) unselectedSecondDarkMode else unselectedSecondLightMode,
                            unselectedDarkColor = if(isSystemInDarkTheme()) unselectedThirdDarkMode else unselectedThirdLightMode,
                            selectedLightColor = if(isSystemInDarkTheme()) selectedFirstDarkMode else selectedFirstLightMode,
                            selectedMediumColor = if(isSystemInDarkTheme()) selectedSecondDarkMode else selectedSecondLightMode,
                            selectedDarkColor = if(isSystemInDarkTheme()) selectedThirdDarkMode else selectedThirdLightMode,
                            route = SelectenScreen.Skill.screen
                        ),

                        Feature(
                            title = "Interests",
                            icon = Icons.Default.Favorite ,
                            unselectedLightColor = if(isSystemInDarkTheme()) unselectedFirstDarkMode else unselectedFirstLightMode,
                            unselectedMediumColor = if(isSystemInDarkTheme()) unselectedSecondDarkMode else unselectedSecondLightMode,
                            unselectedDarkColor = if(isSystemInDarkTheme()) unselectedThirdDarkMode else unselectedThirdLightMode,
                            selectedLightColor = if(isSystemInDarkTheme()) selectedFirstDarkMode else selectedFirstLightMode,
                            selectedMediumColor = if(isSystemInDarkTheme()) selectedSecondDarkMode else selectedSecondLightMode,
                            selectedDarkColor = if(isSystemInDarkTheme()) selectedThirdDarkMode else selectedThirdLightMode,
                            route = SelectenScreen.Int.screen
                        ),

                        Feature(
                            title = "Contact",
                            icon = Icons.Default.ContactPhone,
                            unselectedLightColor = if(isSystemInDarkTheme()) unselectedFirstDarkMode else unselectedFirstLightMode,
                            unselectedMediumColor = if(isSystemInDarkTheme()) unselectedSecondDarkMode else unselectedSecondLightMode,
                            unselectedDarkColor = if(isSystemInDarkTheme()) unselectedThirdDarkMode else unselectedThirdLightMode,
                            selectedLightColor = if(isSystemInDarkTheme()) selectedFirstDarkMode else selectedFirstLightMode,
                            selectedMediumColor = if(isSystemInDarkTheme()) selectedSecondDarkMode else selectedSecondLightMode,
                            selectedDarkColor = if(isSystemInDarkTheme()) selectedThirdDarkMode else selectedThirdLightMode,
                            route = SelectenScreen.Cont.screen
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