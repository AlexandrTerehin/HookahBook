package ru.alexandrterehin.hookahbook.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import ru.alexandrterehin.hookahbook.R
import ru.alexandrterehin.hookahbook.app.theme.BackgroundBasicColorDark
import ru.alexandrterehin.hookahbook.app.theme.BackgroundSelectedColorDark
import ru.alexandrterehin.hookahbook.app.theme.cardBig
import ru.alexandrterehin.hookahbook.app.theme.dimen4
import ru.alexandrterehin.hookahbook.presentation.models.ComponentPaddings
import ru.alexandrterehin.hookahbook.presentation.toPaddings
import ru.alexandrterehin.hookahbook.provider.AppResourceProvider
import ru.alexandrterehin.hookahbook.provider.ResourceProvider

/**
 * Компонент карты добавление нового
 *
 * @param click обрабочик нажатия
 */
@Composable
fun CardBigAddComponent(
    size: Dp = cardBig,
    paddings: ComponentPaddings = 0.toPaddings(),
    weight: Float = 1f,
    providerResources: ResourceProvider,
    click: () -> Unit = {}
) {
    OutlinedCard(
        border = BorderStroke(dimen4, BackgroundSelectedColorDark),
        colors = CardDefaults.cardColors(
            containerColor = BackgroundBasicColorDark
        ),
        modifier = Modifier
            .size(size)
            .padding(
                start = paddings.start,
                top = paddings.top,
                end = paddings.end,
                bottom = paddings.bottom
            )
            .clickable { click() }
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_24_add),
            tint = BackgroundSelectedColorDark,
            contentDescription = providerResources.getString(R.string.add),
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview
@Composable
fun CardBigAddComponentPreview() {
    CardBigAddComponent(providerResources = AppResourceProvider(context = LocalContext.current))
}