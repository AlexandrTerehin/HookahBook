package ru.alexandrterehin.hookahbook.app.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


@SuppressLint("ConflictingOnColor")
private val DarkColorPalette = darkColorScheme(
    primary = Blue,
    primaryContainer = Blue,
    onPrimary = White,
    secondary = TextSecondaryColorDark,
    secondaryContainer = TextSecondaryColorDark,
    onSecondary = Black,

    background = BackgroundBasicColorDark,
    onBackground = BackgroundBasicColorDark,

    surface = CardDark,
    onSurface = CardDark
)

@SuppressLint("ConflictingOnColor")
private val LightColorPalette = lightColorScheme(
    primary = White,
    primaryContainer = Red,
    onPrimary = Black,
    secondary = TextSecondaryColorDark,
    secondaryContainer = TextSecondaryColorDark,
    onSecondary = Black,

    background = BackgroundBasicColorDark,
    onBackground = BackgroundBasicColorDark,

    surface = BackgroundAdditionalColorDark,
    onSurface = BackgroundAdditionalColorDark
)

val HookahBookTypography: Typography
    @Composable get() = MaterialTheme.typography

@Composable
fun HookahBookTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val typography = if (darkTheme) {
        DarkTypography
    } else {
        LightTypography
    }

    MaterialTheme(
        colorScheme = colors,
        typography = typography,
        shapes = Shapes(),
        content = content
    )
}