package ru.alexandrterehin.hookahbook.presentation.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import ru.alexandrterehin.hookahbook.R
import ru.alexandrterehin.hookahbook.app.theme.BackgroundAdditionalColorDark
import ru.alexandrterehin.hookahbook.app.theme.TextPrimaryColorDark
import ru.alexandrterehin.hookahbook.app.theme.cardAdd
import ru.alexandrterehin.hookahbook.app.theme.dimen16
import ru.alexandrterehin.hookahbook.app.theme.dimen4
import ru.alexandrterehin.hookahbook.app.theme.dimen8
import ru.alexandrterehin.hookahbook.presentation.toPaddings
import ru.alexandrterehin.hookahbook.provider.AppResourceProvider
import ru.alexandrterehin.hookahbook.provider.ResourceProvider
import ru.alexandrterehin.hookahbook.ui.components.CardBigAddComponent

@Composable
fun ScreenHome(providerResources: ResourceProvider) {

    val listManufacturer = listOf(
        {},
        {},
        {},
    )

    val listTobacco = listOf(
        {},
        {}
    )

    val listMix = listOf(
        {},
        {},
        {},
        {},
        {},
        {},
        {},
        {},
        {},
    )

    val paddings = 16.toPaddings()

    LazyColumn(
        modifier = Modifier
            .padding(dimen16)
            .fillMaxSize()
    ) {
        item {
            Text(
                text = providerResources.getString(R.string.title_manufacturer),
                color = TextPrimaryColorDark
            )
            LazyRow(
                modifier = Modifier
                    .fillMaxSize()
                    .border(
                        border = BorderStroke(dimen4, color = BackgroundAdditionalColorDark),
                        shape = RoundedCornerShape(dimen16)
                    )
            ) {
                items(listManufacturer) { item ->
                    CardBigAddComponent(
                        size = cardAdd,
                        paddings = paddings,
                        providerResources = providerResources,
                        click = item
                    )
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(dimen8))
        }

        item {
            Text(
                text = providerResources.getString(R.string.title_tobacco),
                color = TextPrimaryColorDark
            )
            LazyRow(
                modifier = Modifier
                    .fillMaxSize()
                    .border(
                        border = BorderStroke(dimen4, color = BackgroundAdditionalColorDark),
                        shape = RoundedCornerShape(dimen16)
                    )
            ) {
                items(listTobacco) { item ->
                    CardBigAddComponent(
                        size = cardAdd,
                        paddings = paddings,
                        providerResources = providerResources,
                        click = item
                    )
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(dimen8))
        }

        item {
            Text(
                text = providerResources.getString(R.string.title_mix),
                color = TextPrimaryColorDark
            )
            LazyRow(
                modifier = Modifier
                    .fillMaxSize()
                    .border(
                        border = BorderStroke(
                            dimen4,
                            color = BackgroundAdditionalColorDark
                        ),
                        shape = RoundedCornerShape(dimen16)
                    )
            ) {
                items(listMix) { item ->
                    CardBigAddComponent(
                        size = cardAdd,
                        paddings = paddings,
                        providerResources = providerResources,
                        click = item
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ScreenHomePreview() {
    ScreenHome(providerResources = AppResourceProvider(context = LocalContext.current))
}