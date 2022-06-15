package com.example.cvapp


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.material.*
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.cvapp.bars.data.BottomNavItem
import com.example.cvapp.bars.data.NoRippleTheme
import com.example.cvapp.navigation.Screen

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    onItemClick: (BottomNavItem) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    CompositionLocalProvider(LocalRippleTheme provides NoRippleTheme) {
        BottomNavigation(
            backgroundColor = MaterialTheme.colors.surface,
        ) {
            val cvScreens = listOf(Screen.Info.route,Screen.Education.route,Screen.Experience.route,Screen.Interests.route,Screen.Contact.route)

            items.forEach { item ->
                
                val selected = if(item.route == Screen.Home.route || item.route == Screen.Contact.route)item.route == backStackEntry.value?.destination?.route
                else item.route == backStackEntry.value?.destination?.route || cvScreens.contains(backStackEntry.value?.destination?.route)

                BottomNavigationItem(
                    selected = selected,
                    onClick = { onItemClick(item) },
                    selectedContentColor = MaterialTheme.colors.primary,
                    unselectedContentColor = MaterialTheme.colors.secondary,
                    icon = {
                        Column(
                            horizontalAlignment = CenterHorizontally,
                            verticalArrangement = SpaceBetween
                        ) {
                            Icon(painter = item.icon, contentDescription = item.title, modifier = Modifier.size(24.dp))
                            if (selected) {
                                Text(text = item.title)
                            }
                        }
                    }
                )
            }
        }
    }
}


