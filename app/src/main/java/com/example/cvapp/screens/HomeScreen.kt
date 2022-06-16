package com.example.cvapp


import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp
import com.example.cvapp.patterns.randomPatternPath
import com.example.cvapp.ui.theme.BackgroundPattern

@Composable
fun HomeScreen() {
    BoxWithConstraints(
            modifier = Modifier
                .background(MaterialTheme.colors.background)
                .fillMaxSize()
        ){

        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()

        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = randomPatternPath(width, height),
                color = BackgroundPattern
            )
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()) {
            Text(
                text = "Body",
                fontStyle = FontStyle.Normal,
                fontSize = 20.sp,
                color = MaterialTheme.colors.onBackground
            )
    }

    }
}




