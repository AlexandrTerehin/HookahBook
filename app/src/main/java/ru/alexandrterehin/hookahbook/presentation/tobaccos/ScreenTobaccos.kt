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
import ru.alexandrterehin.hookahbook.app.theme.dimen16
import ru.alexandrterehin.hookahbook.data.test_data.DBModels
import ru.alexandrterehin.hookahbook.provider.AppResourceProvider
import ru.alexandrterehin.hookahbook.provider.ResourceProvider
import ru.alexandrterehin.hookahbook.ui.components.CellComponent

@Composable
fun ScreenTobaccos(providerResources: ResourceProvider) {
    val list = DBModels.getTobacco().map { tobacco -> tobacco.toCellModel() }


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