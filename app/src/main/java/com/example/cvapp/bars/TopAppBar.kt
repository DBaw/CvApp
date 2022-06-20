package com.example.cvapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.cvapp.bars.data.NoRippleTheme
import com.example.cvapp.navigation.Screen
import com.example.cvapp.ui.theme.Paddings
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopBar(scaffoldState: ScaffoldState, scope: CoroutineScope, navController: NavController){
    CompositionLocalProvider(LocalRippleTheme provides NoRippleTheme) {

        val route = navController.currentBackStackEntryAsState().value?.destination?.route
        val cvScreens = listOf(Screen.Info.route,Screen.Education.route,Screen.Skills.route,Screen.Experience.route,Screen.Interests.route,Screen.Contact.route)

        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = MaterialTheme.colors.surface,
            contentColor = MaterialTheme.colors.onSurface
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Paddings.Medium.padding)
            ) {
                if(cvScreens.contains(route))
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Go back",
                    Modifier
                        .size(30.dp)
                        .clickable {
                            navController.popBackStack()
                        }
                )
                }
        }
    }
}
