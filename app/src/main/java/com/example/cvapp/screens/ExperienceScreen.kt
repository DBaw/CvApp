package com.example.cvapp.screens


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.cvapp.R
import com.example.cvapp.patterns.randomPatternPath
import com.example.cvapp.screens.functions.ExpEduData

@Composable
fun ExperienceScreen() {
    BoxWithConstraints(
        Modifier
            .fillMaxHeight()
    ) {

        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()
        val patternColor = MaterialTheme.colors.secondary

        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = randomPatternPath(width, height),
                color = patternColor
            )
        }

            Exp(
                place = "FITECH",
                image = painterResource(id = R.drawable.fitech_logo),
                position = "Junior Test Engineer",
                startDate = "04.2020",
                endDate = "Still Working",
                description = "Creating tests for PCBA\n" +
                        "Contact with the customer"
            )
        }
    }

@Composable
fun Exp(place: String, image: Painter, position: String, startDate: String, endDate: String, description: String){
    Box(
        modifier = Modifier
            .background(Color.Transparent)
    ) {

        Column {
            ExpEduData(
                head = place,
                icon = image
            )
            ExpEduData(
                mainText = "Position",
                description = position
            )
            ExpEduData(
                mainText = "From",
                description = startDate
            )
            ExpEduData(
                mainText = "To",
                description = endDate
            )
            ExpEduData(
                responsibilities = description,

            )
        }
    }
}