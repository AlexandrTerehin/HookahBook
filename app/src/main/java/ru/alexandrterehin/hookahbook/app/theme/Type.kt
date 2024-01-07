package ru.alexandrterehin.hookahbook.app.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val CellTextTitle = TextStyle(
    color = TextPrimaryColorDark,
    fontSize = 16.sp,
    lineHeight = 20.sp,
    fontWeight = FontWeight(500),
    letterSpacing = 0.2.sp
)

val CellTextSubtitle = TextStyle(
    color = TextSecondaryColorDark,
    fontSize = 14.sp,
    lineHeight = 16.sp,
    fontWeight = FontWeight(400),
    letterSpacing = 0.2.sp
)

val CellTextComment = TextStyle(
    color = TextPrimaryColorDark,
    fontSize = 14.sp,
    lineHeight = 16.sp,
    fontWeight = FontWeight(400),
    letterSpacing = 0.2.sp
)

val DarkTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Bold,
        color = White,
        fontSize = 28.sp
    ),
    displayMedium = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Bold,
        color = White,
        fontSize = 21.sp
    ),
    displaySmall = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.SemiBold,
        color = White,
        fontSize = 18.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Medium,
        color = White,
        fontSize = 15.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Medium,
        color = White,
        fontSize = 18.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Bold,
        color = White,
        fontSize = 16.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Normal,
        color = White,
        fontSize = 14.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Bold,
        color = White,
        fontSize = 14.sp
    ),
    labelLarge = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Medium,
        color = White,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        color = White,
        fontSize = 14.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)

// set of light material typography styles to start with.
val LightTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Bold,
        color = Black,
        fontSize = 28.sp
    ),
    displayMedium = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Bold,
        color = Black,
        fontSize = 21.sp
    ),
    displaySmall = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.SemiBold,
        color = Black,
        fontSize = 18.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Medium,
        color = Black,
        fontSize = 15.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Medium,
        color = Black,
        fontSize = 18.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Bold,
        color = Black,
        fontSize = 15.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Normal,
        color = Black,
        fontSize = 14.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Bold,
        color = Black,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Medium,
        color = Black,
        fontSize = 14.sp
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        color = Black,
        fontSize = 14.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        color = Black,
        fontSize = 12.sp
    )
)