package com.example.cvapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.example.cvapp.R
import com.example.cvapp.screens.functions.CvSkillsInterestsData
import com.example.cvapp.ui.theme.padding

@Composable
fun InterestsScreen(){
    BoxWithConstraints(modifier = Modifier
        .fillMaxSize()
        .background(Color.Transparent)) {

        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "INTERESTS",
                color = MaterialTheme.colors.onBackground,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h4.fontSize,
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.big)
                    .padding(top = MaterialTheme.padding.big)
            )
            CvSkillsInterestsData(
                text = "Stand-Up Comedy",
                image = painterResource(id = R.drawable.comedy),
                icon = true
            )
            CvSkillsInterestsData(
                text = "Basketball",
                image = painterResource(id = R.drawable.basketball),
                icon = true
            )
            CvSkillsInterestsData(
                text = "Gardening",
                image = painterResource(id = R.drawable.garden),
                icon = true
            )
            CvSkillsInterestsData(
                text = "Cooking",
                image = painterResource(id = R.drawable.cooking),
                icon = true
            )
        }
    }
}