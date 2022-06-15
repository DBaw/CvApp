package com.example.cvapp.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.example.cvapp.patterns.randomPatternPath
import com.example.cvapp.screens.functions.cvSkillsInterestsData
import com.example.cvapp.ui.theme.BackgroundPattern

@Composable
fun SkillsScreen(){
    BoxWithConstraints(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)) {

        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()

        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = randomPatternPath(width,height),
                color = BackgroundPattern
            )}

        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()) {
            cvSkillsInterestsData(text = "Software Skills", head = true)
            cvSkillsInterestsData(text = "Kotlin")
            cvSkillsInterestsData(text = "Jetpack Compose")
            cvSkillsInterestsData(text = "Android Studio")
            cvSkillsInterestsData(text = "Git")
            cvSkillsInterestsData(text = "General Skills", head = true)
            cvSkillsInterestsData(text = "Adobe XD")
            cvSkillsInterestsData(text = "UI Standards")
            cvSkillsInterestsData(text = "Jira")
            cvSkillsInterestsData(text = "Languages", head = true)
            cvSkillsInterestsData(text = "Polish native")
            cvSkillsInterestsData(text = "English B2")
        }
    }
}