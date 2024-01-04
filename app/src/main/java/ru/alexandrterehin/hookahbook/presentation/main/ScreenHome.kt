package ru.alexandrterehin.hookahbook.presentation.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ScreenHome() {
    Text(
        text = "Home",
        Modifier.fillMaxSize(),
        textAlign = TextAlign.Center
    )
}