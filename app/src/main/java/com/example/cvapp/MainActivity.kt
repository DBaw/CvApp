package com.example.cvapp

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Article
import androidx.compose.material.icons.filled.FolderSpecial
import androidx.compose.material.icons.filled.Home
import androidx.navigation.compose.rememberNavController
import com.example.cvapp.bars.data.BottomNavItem
import com.example.cvapp.navigation.Screen
import com.example.cvapp.ui.theme.CvAppTheme


class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CvAppTheme() {

                if(isSystemInDarkTheme()){
                    getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
                }

                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()

                Scaffold(

                    scaffoldState = scaffoldState,

                    bottomBar = {
                        BottomNavigationBar(
                            items = listOf(
                                BottomNavItem(
                                    title = "CV",
                                    route = Screen.Cv.route,
                                    icon = Icons.Default.Article
                                ),
                                BottomNavItem(
                                    title = "Home",
                                    route = Screen.Home.route,
                                    icon = Icons.Default.Home
                                ),
                                BottomNavItem(
                                    title = "Projects",
                                    route = Screen.Projects.route,
                                    icon = Icons.Default.FolderSpecial
                                ),
                            ),
                            navController = navController,
                            onItemClick = {
                                    navController.navigate(it.route)
                            }
                        )
                    }
                ) {
                    NavGraph(navController = navController)
                }
            }
        }
    }
}
