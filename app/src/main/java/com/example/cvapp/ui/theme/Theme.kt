package com.example.cvapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color.White,
    primaryVariant = Color(0xFF636060),
    secondary = Color(0xFFB3B2B1),
    secondaryVariant = Color(0xFF0E0E0E),
    background = Color(0xFF0C0C0C),
    surface = Color(0xFF141414),
    error = Color.Red,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color(0xFFADABA9),
    onError = Color.Black
)

private val LightColorPalette = lightColors(
    primary = Color(0xFF3D231C),
    primaryVariant = Color(0xFF613A2F),
    secondary = Color(0xFFA8857C),
    secondaryVariant = Color(0xFFA38981),
    background = Color(0xFFA78D85),
    surface = Color(0xFF745549),
    error = Color.Red,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.Black,
    onSurface = Color(0xFF553C33),
    onError = Color.White
)

@Composable
fun CvAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}