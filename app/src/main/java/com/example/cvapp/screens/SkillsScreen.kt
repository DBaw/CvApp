package com.example.cvapp.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.cvapp.patterns.randomPatternPath
import com.example.cvapp.screens.functions.CvSkillsInterestsData
import com.example.cvapp.ui.theme.Paddings

@Composable
fun SkillsScreen(){
    BoxWithConstraints(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)) {

        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()
        val patternColor = MaterialTheme.colors.secondary

        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = randomPatternPath(width,height),
                color = patternColor
            )}

        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "SKILLS",
                color = MaterialTheme.colors.onBackground,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h4.fontSize,
                modifier = Modifier
                    .padding(horizontal = Paddings.Big.padding)
                    .padding(top = Paddings.Big.padding)
            )
            CvSkillsInterestsData(text = "SOFTWARE", head = true)
            CvSkillsInterestsData(text = "Kotlin")
            CvSkillsInterestsData(text = "Jetpack Compose")
            CvSkillsInterestsData(text = "Android Studio")
            CvSkillsInterestsData(text = "GENERAL", head = true)
            CvSkillsInterestsData(text = "Git")
            CvSkillsInterestsData(text = "Jira")
            CvSkillsInterestsData(text = "Adobe XD Basics")
            CvSkillsInterestsData(text = "UI Standards")
            CvSkillsInterestsData(text = "LANGUAGES", head = true)
            CvSkillsInterestsData(text = "Polish native")
            CvSkillsInterestsData(text = "English B2")
        }
    }
}