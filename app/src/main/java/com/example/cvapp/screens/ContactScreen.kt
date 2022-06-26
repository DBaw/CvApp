package com.example.cvapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.cvapp.screens.functions.Contact
import com.example.cvapp.screens.functions.Hyperlinks
import com.example.cvapp.ui.theme.padding

@Composable
fun ContactScreen() {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
    ) {

        Column {
            Text(
                text = "CONTACT",
                color = MaterialTheme.colors.onBackground,
                fontSize = MaterialTheme.typography.h4.fontSize,
                fontWeight = FontWeight.Bold,
                letterSpacing = 3.sp,
                modifier = Modifier
                    .padding(
                        horizontal = MaterialTheme.padding.big
                    )
                    .padding(
                        top = MaterialTheme.padding.big,
                        bottom = MaterialTheme.padding.medium
                    )
            )
            Contact(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = MaterialTheme.padding.big
                    )
                    .padding(
                        top = MaterialTheme.padding.big,
                        bottom = MaterialTheme.padding.medium
                    ),
                contactType = "Phone",
                contact = "505 294 567",
                icon = Icons.Default.Phone
            )
            Contact(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = MaterialTheme.padding.big,
                        vertical = MaterialTheme.padding.medium
                    ),
                contactType = "E-Mail",
                typeWeight = 3f,
                contact = "dk.bawolek@gmail.com",
                contactWeight = 7f,
                icon = Icons.Default.Mail
            )
            Hyperlinks(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = MaterialTheme.padding.big,
                        vertical = MaterialTheme.padding.medium
                    ),
                text = "You can also find me on Linkedin",
                link = listOf("Linkedin"),
                hyperlinks = listOf("https://www.linkedin.com/in/dominik-bawołek-b7449423b"),
                textColor = MaterialTheme.colors.primary,
                linkColor = MaterialTheme.colors.onBackground,
                fontSize = 22.sp
            )

        }
    }
}
