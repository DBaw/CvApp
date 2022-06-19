package com.example.cvapp.screens



import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cvapp.patterns.randomPatternPath
import com.example.cvapp.ui.theme.Paddings


@ExperimentalMaterialApi
@Composable
fun ProjectsScreen() {
    BoxWithConstraints(Modifier.fillMaxSize()
        .background(MaterialTheme.colors.background)) {

        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()
        val patternColor = MaterialTheme.colors.secondary

        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = randomPatternPath(width, height),
                color = patternColor
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            val url = "https://github.com/DBaw/UnitConverter"
            val uriHandler = LocalUriHandler.current


            Text(
                text = "MY PROJECTS",
                color = MaterialTheme.colors.primary,
                fontSize = 30.sp,
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

            Card(
                modifier = Modifier
                    .padding(
                        horizontal = Paddings.Big.padding
                    )
                    .padding(
                        top = Paddings.Medium.padding
                    )
                    .fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                backgroundColor = MaterialTheme.colors.background,
                elevation = 3.dp,
                onClick = { uriHandler.openUri(url) }
            ) {
                Image(
                    painter = if (isSystemInDarkTheme()) {
                        painterResource(id = com.example.cvapp.R.drawable.unitconverterlight)
                    } else {
                        painterResource(id = com.example.cvapp.R.drawable.unitconverterdark)
                    },
                    contentDescription = "Units Converter",
                    contentScale = ContentScale.FillWidth
                )
            }

        }
    }
}