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
import com.example.cvapp.screens.functions.CvSkillsInterestsData
import com.example.cvapp.R
import com.example.cvapp.ui.theme.padding

@Composable
fun SkillsScreen(){
    BoxWithConstraints(modifier = Modifier
        .fillMaxSize()
        .background(Color.Transparent)) {

        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "SKILLS",
                color = MaterialTheme.colors.onBackground,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h4.fontSize,
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.big)
                    .padding(top = MaterialTheme.padding.big)
            )
            CvSkillsInterestsData(
                text = "SOFTWARE",
                head = true
            )
            CvSkillsInterestsData(
                text = "Kotlin",
                image = painterResource(id = R.drawable.kotlin)
            )
            CvSkillsInterestsData(
                text = "Jetpack Compose",
                image = painterResource(id = R.drawable.jetpack_compose)
            )
            CvSkillsInterestsData(
                text = "Android Studio",
                image = painterResource(id = R.drawable.android_studio)
            )
            CvSkillsInterestsData(
                text = "GENERAL",
                head = true
            )
            CvSkillsInterestsData(
                text = "Gitlab/Github",
                image = painterResource(id = R.drawable.gitlab)
            )
            CvSkillsInterestsData(
                text = "Jira",
                image = painterResource(id = R.drawable.jira)
            )
            CvSkillsInterestsData(
                text = "Adobe XD Basics",
                image = painterResource(id = R.drawable.adobe_xd)
            )
            CvSkillsInterestsData(
                text = "UI Standards",
                image = painterResource(id = R.drawable.ui)
            )
            CvSkillsInterestsData(
                text = "LANGUAGES",
                head = true
            )
            CvSkillsInterestsData("Polish native")
            CvSkillsInterestsData(text = "English B2")
            
            Spacer(modifier = Modifier.height(MaterialTheme.padding.doubleLarge))
        }
    }
}