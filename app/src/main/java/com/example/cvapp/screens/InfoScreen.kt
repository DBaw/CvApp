package com.example.cvapp

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.cvapp.patterns.randomPatternPath
import com.example.cvapp.screens.functions.CvInfoData
import com.example.cvapp.ui.theme.padding

@Composable
fun InfoScreen() {
    BoxWithConstraints(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()
    ) {

        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()
        val patternColor = MaterialTheme.colors.secondary

        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = randomPatternPath(width,height),
                color = patternColor
            )}

        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(
                vertical = MaterialTheme.padding.big,
                horizontal = MaterialTheme.padding.medium
            )
                .fillMaxWidth()
        ) {
            Text(
                text = "INFORMATION",
                color = MaterialTheme.colors.onBackground,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h4.fontSize,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.big)
                    .padding(top = MaterialTheme.padding.big)
            )
            CvInfoData(name = "Name", "Dominik")
            CvInfoData(name = "Surname", "Bawołek")
            CvInfoData(name = "Date of birth", "21.01.1995")
            CvInfoData(name = "Adress", "Sucha Beskidzka\nMałopolskie")

        }
    }
}



