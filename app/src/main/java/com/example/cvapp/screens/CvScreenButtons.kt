package com.example.cvapp


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavController
import com.example.cvapp.navigation.Screen
import com.example.cvapp.screens.functions.GradientButton
import com.example.cvapp.ui.theme.*

@Composable
fun cvScreenButtons(navController: NavController,
             spacer: Dp
) {
    val colors = listOf(
        MaterialTheme.colors.primary,
        MaterialTheme.colors.primaryVariant,
        MaterialTheme.colors.secondary,
        MaterialTheme.colors.secondaryVariant,
        )

    Box(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.padding(horizontal = Paddings.DoubleLarge.padding, vertical = Paddings.Large.padding)
        )
        {
            Spacer(modifier = Modifier.size(spacer))
            GradientButton(
                text = "Info",
                icon = painterResource(id = R.drawable.info),
                gradient = Brush.horizontalGradient(
                    colors = colors
                )
            ) {
                navController.navigate(Screen.Info.route)
            }
            Spacer(modifier = Modifier.size(spacer))
            GradientButton(
                text = "Education",
                icon = painterResource(id = R.drawable.school),
                gradient = Brush.horizontalGradient(
                    colors = colors
                )
            ) {
                navController.navigate(Screen.Education.route)
            }
            Spacer(modifier = Modifier.size(spacer))
            GradientButton(
                text = "Experience",
                icon = painterResource(id = R.drawable.work),
                gradient = Brush.horizontalGradient(
                    colors = colors
                )
            ) {
                navController.navigate(Screen.Experience.route)
            }
            Spacer(modifier = Modifier.size(spacer))
            GradientButton(
                text = "Skills",
                icon = painterResource(id = R.drawable.skills),
                gradient = Brush.horizontalGradient(
                    colors = colors
                )
            ) {
                navController.navigate(Screen.Skills.route)
            }
            Spacer(modifier = Modifier.size(spacer))
            GradientButton(
                text = "Interests",
                icon = painterResource(id = R.drawable.favorite),
                gradient = Brush.horizontalGradient(
                    colors = colors
                )
            ) {
                navController.navigate(Screen.Interests.route)
            }

        }
    }
}




