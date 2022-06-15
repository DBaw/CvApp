package com.example.cvapp.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.cvapp.screens.functions.CvExpEduData
import com.example.cvapp.ui.theme.Paddings
import com.example.cvapp.ui.theme.Shapes
import com.example.cvapp.R
import com.example.cvapp.patterns.randomPatternPath
import com.example.cvapp.screens.functions.ExpEdu
import com.example.cvapp.ui.theme.BackgroundPattern

@Composable
fun EducationScreen() {
    BoxWithConstraints(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {


        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()

        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = randomPatternPath(width, height),
                color = BackgroundPattern
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
            ExpEdu(
                head = place,
                icon = icon
            )
            ExpEdu(
                mainText = "Field",
                description = field
            )
            ExpEdu(
                mainText = "Specialty",
                description = specialty
            )
            ExpEdu(
                mainText = "Level",
                description = level
            )
            ExpEdu(
                mainText = "From",
                description = startDate
            )
            ExpEdu(
                mainText = "To",
                description = endDate
            )
        }
    }
}