package com.example.millionairegame.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.millionairegame.R

val starjedi = FontFamily(
    Font(R.font.starjedi, FontWeight.Normal),
)

val exo2 = FontFamily(
    Font(R.font.exo2, FontWeight.Normal)
)

val exo2_italics = FontFamily(
    Font(R.font.exo2_italic, FontWeight.Normal)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = starjedi,
        fontWeight = FontWeight.Normal,
        fontSize = 25.sp,
        lineHeight = 25.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = exo2,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = exo2_italics,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    )
)