package ru.alexandrterehin.hookahbook.presentation.tobaccos

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import ru.alexandrterehin.hookahbook.provider.ResourceProvider

@Composable
fun ScreenTobaccos(providerResources: ResourceProvider) {
    Text(
        text = "Tobaccos",
        Modifier.fillMaxSize(),
        textAlign = TextAlign.Center
    )
}