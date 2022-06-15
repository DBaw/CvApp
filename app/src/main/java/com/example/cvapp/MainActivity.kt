package com.example.cvapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.example.cvapp.bars.data.BottomNavItem
import com.example.cvapp.navigation.Screen
import com.example.cvapp.ui.theme.CvAppTheme


class MainActivity : ComponentActivity() {
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
                                    icon = painterResource(id = R.drawable.cv)
                                ),
                                BottomNavItem(
                                    title = "Home",
                                    route = Screen.Home.route,
                                    icon = painterResource(id = R.drawable.home)
                                ),
                                BottomNavItem(
                                    title = "Contact",
                                    route = Screen.Contact.route,
                                    icon = painterResource(id = R.drawable.contact)
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
