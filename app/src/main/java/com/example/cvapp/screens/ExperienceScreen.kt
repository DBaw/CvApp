package com.example.cvapp.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.example.cvapp.R
import com.example.cvapp.screens.functions.ExpEduData
import com.example.cvapp.ui.theme.padding

@Composable
fun ExperienceScreen() {
    BoxWithConstraints(
        Modifier
            .fillMaxHeight()
            .background(Color.Transparent)
    ) {


        Column{
            Text(
                text = "EXPERIENCE",
                color = MaterialTheme.colors.onBackground,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h4.fontSize,
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.big)
                    .padding(top = MaterialTheme.padding.big)
            )
            Exp(
                place = "FITECH",
                image = painterResource(id = R.drawable.fitech_logo),
                position = "Junior Test Engineer",
                startDate = "04.2020",
                endDate = "Still Working",
                description = listOf(
                    "Creating tests for PCBA",
                    "Running tests",
                    "Configuration of the test station",
                    "Creating drivers for new devices",
                    "Contact with a client"
                )
            )
            Spacer(modifier = Modifier.height(MaterialTheme.padding.doubleLarge))
        }
        }
    }

@Composable
fun Exp(place: String, image: Painter, position: String, startDate: String, endDate: String, description: List<String>){
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