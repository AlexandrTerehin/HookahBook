package ru.alexandrterehin.hookahbook.presentation.tobaccos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import ru.alexandrterehin.hookahbook.R
import ru.alexandrterehin.hookahbook.app.theme.dimen16
import ru.alexandrterehin.hookahbook.provider.AppResourceProvider
import ru.alexandrterehin.hookahbook.provider.ResourceProvider
import ru.alexandrterehin.hookahbook.ui.components.CellComponent
import ru.alexandrterehin.hookahbook.ui.components.CellModel

@Composable
fun ScreenTobaccos(providerResources: ResourceProvider) {
    val list = listOf(
        CellModel(
            imageRes = R.drawable.il_tobacco_admiral_acbar,
            imageDescription = "Tobacco admiral acbar",
            title = "Tobacco Admiral Acbar"
        ),
        CellModel(
            imageRes = R.drawable.il_tobacco_admiral_acbar,
            imageDescription = "Tobacco admiral acbar",
            title = "Tobacco Admiral Acbar"
        ),
        CellModel(
            imageRes = R.drawable.il_tobacco_admiral_acbar,
            imageDescription = "Tobacco admiral acbar",
            title = "Tobacco Admiral Acbar"
        ),
        CellModel(
            imageRes = R.drawable.il_tobacco_admiral_acbar,
            imageDescription = "Tobacco admiral acbar",
            title = "Tobacco Admiral Acbar"
        ),
        CellModel(
            imageRes = R.drawable.il_tobacco_admiral_acbar,
            imageDescription = "Tobacco admiral acbar",
            title = "Tobacco Admiral Acbar"
        ),
        CellModel(
            imageRes = R.drawable.il_tobacco_admiral_acbar,
            imageDescription = "Tobacco admiral acbar",
            title = "Tobacco Admiral Acbar"
        ),
        CellModel(
            imageRes = R.drawable.il_tobacco_admiral_acbar,
            imageDescription = "Tobacco admiral acbar",
            title = "Tobacco Admiral Acbar"
        ),
        CellModel(
            imageRes = R.drawable.il_tobacco_admiral_acbar,
            imageDescription = "Tobacco admiral acbar",
            title = "Tobacco Admiral Acbar"
        ),
        CellModel(
            imageRes = R.drawable.il_tobacco_admiral_acbar,
            imageDescription = "Tobacco admiral acbar",
            title = "Tobacco Admiral Acbar"
        ),
        CellModel(
            imageRes = R.drawable.il_tobacco_admiral_acbar,
            imageDescription = "Tobacco admiral acbar",
            title = "Tobacco Admiral Acbar"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = dimen16)
    ) {
        list.forEach { model ->
            CellComponent(data = model)
        }
    }
}

@Preview
@Composable
fun ScreenTobaccosPreview() {
    ScreenTobaccos(providerResources = AppResourceProvider(context = LocalContext.current))
}