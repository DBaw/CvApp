package com.example.cvapp.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.cvapp.patterns.randomPatternPath
import com.example.cvapp.screens.functions.Contact
import com.example.cvapp.screens.functions.Hyperlinks
import com.example.cvapp.ui.theme.Paddings

@Composable
fun ContactScreen() {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {

        val context = LocalContext.current
        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()
        val patternColor = MaterialTheme.colors.secondary

        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = randomPatternPath(width, height),
                color = patternColor
            )
        }

        Column {
            Text(
                text = "CONTACT",
                color = MaterialTheme.colors.onBackground,
                fontSize = MaterialTheme.typography.h4.fontSize,
                fontWeight = FontWeight.Bold,
                letterSpacing = 3.sp,
                modifier = Modifier
                    .padding(
                        horizontal = Paddings.Big.padding
                    )
                    .padding(
                        top = Paddings.Big.padding,
                        bottom = Paddings.Medium.padding
                    )
            )
            Contact(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = Paddings.Big.padding
                    )
                    .padding(
                        top = Paddings.Big.padding,
                        bottom = Paddings.Medium.padding
                    ),
                contactType = "Phone",
                contact = "505 294 567",
                icon = Icons.Default.Phone
            )
            Contact(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = Paddings.Big.padding,
                        vertical = Paddings.Medium.padding
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
                        horizontal = Paddings.Big.padding,
                        vertical = Paddings.Medium.padding
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
