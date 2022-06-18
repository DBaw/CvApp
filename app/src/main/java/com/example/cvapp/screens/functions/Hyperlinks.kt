package com.example.cvapp.screens.functions

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit

@Composable
fun Hyperlinks(
    modifier: Modifier,
    text: String,
    link: List<String>,
    hyperlinks: List<String>,
    textColor: Color,
    linkColor: Color,
    linkFontWeight: FontWeight = FontWeight.Normal,
    linkDecoration: TextDecoration = TextDecoration.Underline,
    fontSize: TextUnit,
    textAlign: TextAlign
    ){

    val annotatedString = buildAnnotatedString {
        append(text)
        addStyle(
            style = SpanStyle(
                fontSize = fontSize,
                color = textColor
            ),
            start = 0,
            end = text.length
        )
        link.forEachIndexed { index, link ->
            val startIndex = text.indexOf(link)
            val endIndex = startIndex + link.length
            addStyle(
                style = SpanStyle(
                    color = linkColor,
                    fontWeight = linkFontWeight,
                    textDecoration = linkDecoration
                ),
                start = startIndex,
                end = endIndex
            )
            addStringAnnotation(
                tag = "URL",
                annotation = hyperlinks[index],
                start = startIndex,
                end = endIndex
            )
        }
    }

    val uriHandler = LocalUriHandler.current

    ClickableText(
        modifier = modifier,
        text = annotatedString,
        style = TextStyle(
            textAlign = textAlign
        ),
        onClick ={
            annotatedString
                .getStringAnnotations("URL",it,it)
                .firstOrNull()?.let { stringAnnotation ->
                    uriHandler.openUri(stringAnnotation.item)
                }
        }
    )
}