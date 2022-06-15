package com.example.cvapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color.White,
    primaryVariant = Color(0xFFD6D6D6),
    secondary = Color(0xFFEEEEEE),
    secondaryVariant = Color(0xFF595B70),
    background = Color(0xFF36384B),
    surface = Color(0xFF1c1c1c),
    error = Color.Red,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White,
    onError = Color.Black
)

private val LightColorPalette = lightColors(
    primary = Color(0xFF3D231C),
    primaryVariant = Color(0xFF493029),
    secondary = Color(0xFFA8857C),
    secondaryVariant = Color(0xFFA8837A),
    background = Color(0xFFBEA197),
    surface = Color(0xFF88685C),
    error = Color.Red,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.Black,
    onSurface = Color(0xFF5f4339),
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