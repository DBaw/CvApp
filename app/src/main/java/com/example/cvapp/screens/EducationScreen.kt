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
fun EducationScreen() {
    BoxWithConstraints(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
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

            Edu(
            place = "Cracow",
            icon = painterResource(id = R.drawable.pk_logo),
            field = "Mechanical engineering",
            specialty = "Mechanics of structures\nand materials",
            level = "Engineer",
            startDate = "10.2014",
            endDate = "03.2019"
        )
        }
    }

@Composable
fun Edu(place: String, icon: Painter, field: String, specialty: String, level: String, startDate: String, endDate: String){
    Box(
        modifier = Modifier
            //.padding(Paddings.Large.padding)
            .background(Color.Transparent)
    ) {

        Column {
            ExpEduData(
                head = place,
                icon = icon
            )
            ExpEduData(
                mainText = "Field",
                description = field
            )
            ExpEduData(
                mainText = "Specialty",
                description = specialty
            )
            ExpEduData(
                mainText = "Level",
                description = level
            )
            ExpEduData(
                mainText = "From",
                description = startDate
            )
            ExpEduData(
                mainText = "To",
                description = endDate
            )
        }
    }
}