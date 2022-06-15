package com.example.cvapp


import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    BoxWithConstraints(
            modifier = Modifier
                .background(MaterialTheme.colors.background)
                .fillMaxSize()
        ){

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




