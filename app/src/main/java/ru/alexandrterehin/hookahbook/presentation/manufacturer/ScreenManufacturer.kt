package ru.alexandrterehin.hookahbook.presentation.manufacturer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ScreenManufacturer() {
    Text(
        text = "Manufacturer",
        Modifier.fillMaxSize(),
        textAlign = TextAlign.Center
    )
}