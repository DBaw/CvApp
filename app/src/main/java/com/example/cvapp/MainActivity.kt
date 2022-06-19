package com.example.cvapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Article
import androidx.compose.material.icons.filled.FolderSpecial
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.rememberCoroutineScope
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
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                val scope = rememberCoroutineScope()

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
                    },
                    topBar = { TopBar(scaffoldState,scope,navController)}
                ) {
                    NavGraph(navController = navController)
                }
            }
        }
    }
}
