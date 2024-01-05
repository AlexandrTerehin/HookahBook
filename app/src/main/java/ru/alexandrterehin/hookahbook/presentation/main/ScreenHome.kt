package ru.alexandrterehin.hookahbook.presentation.main

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import ru.alexandrterehin.hookahbook.app.theme.cardAdd
import ru.alexandrterehin.hookahbook.app.theme.dimen16
import ru.alexandrterehin.hookahbook.presentation.toHorizontalPaddings
import ru.alexandrterehin.hookahbook.provider.AppResourceProvider
import ru.alexandrterehin.hookahbook.provider.ResourceProvider
import ru.alexandrterehin.hookahbook.ui.components.CardBigAddComponent

@Composable
fun ScreenHome(providerResources: ResourceProvider) {
    val list = listOf(
        {},
        {}
    )

    val paddings = 16.toHorizontalPaddings()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(top = dimen16),
        modifier = Modifier
            .fillMaxSize()
    ) {
        items(count = list.size) { index ->
            list.forEach { item ->
                CardBigAddComponent(
                    size = cardAdd,
                    paddings = paddings,
                    providerResources = providerResources
                )
            }
        }
    }
}

@Preview
@Composable
fun ScreenHomePreview() {
    ScreenHome(providerResources = AppResourceProvider(context = LocalContext.current))
}