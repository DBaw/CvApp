package com.example.cvapp

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cvapp.patterns.randomPatternPath
import com.example.cvapp.screens.functions.CvInfoData
import com.example.cvapp.ui.theme.BackgroundPattern
import com.example.cvapp.ui.theme.Paddings

@Composable
fun InfoScreen() {
    BoxWithConstraints(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()
    ) {

        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()

        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = randomPatternPath(width,height),
                color = BackgroundPattern
            )}

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(
                vertical = Paddings.Big.padding,
                horizontal = Paddings.Medium.padding
            )
        ) {
            CvInfoData(name = "Name", "Dominik")
            CvInfoData(name = "Surname", "Bawołek")
            CvInfoData(name = "Date of birth", "21.01.1995")
            CvInfoData(name = "Adress", "Sucha Beskidzka\nMałopolskie")

        }
    }
}



