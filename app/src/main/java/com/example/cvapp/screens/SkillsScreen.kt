package com.example.cvapp.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.cvapp.patterns.randomPatternPath
import com.example.cvapp.screens.functions.CvSkillsInterestsData

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
            CvSkillsInterestsData(text = "SOFTWARE SKILLS", head = true)
            CvSkillsInterestsData(text = "Kotlin")
            CvSkillsInterestsData(text = "Jetpack Compose")
            CvSkillsInterestsData(text = "Android Studio")
            CvSkillsInterestsData(text = "GENERAL SKILLS", head = true)
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