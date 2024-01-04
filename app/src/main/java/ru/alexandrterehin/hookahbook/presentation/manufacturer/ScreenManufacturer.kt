package ru.alexandrterehin.hookahbook.presentation.manufacturer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ru.alexandrterehin.hookahbook.app.theme.dimen16
import ru.alexandrterehin.hookahbook.data.model.manufacturer.ManufacturerDto

@Composable
fun ScreenManufacturer() {
    val list = listOf(
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
        ManufacturerDto.init(),
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
    ) {
        items(count = list.size) { index ->
            list.forEach { item ->
                Card(
                    Modifier
                        .padding(dimen16)
                ) {
                    Image(
                        painter = painterResource(id = item.image),
                        contentDescription = item.name
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ScreenManufacturerPreview() {
    ScreenManufacturer()
}