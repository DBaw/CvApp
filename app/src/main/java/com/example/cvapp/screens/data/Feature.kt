package com.example.cvapp.screens.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class Feature(
    val title: String,
    val icon: ImageVector,
    val selectedLightColor: Color,
    val selectedMediumColor: Color,
    val selectedDarkColor: Color,
    val unselectedLightColor: Color,
    val unselectedMediumColor: Color,
    val unselectedDarkColor: Color,
    val route: String
)