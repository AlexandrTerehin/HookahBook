package ru.alexandrterehin.hookahbook.presentation.tobaccos.list.view

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import ru.alexandrterehin.hookahbook.app.theme.JetRortyTheme
import ru.alexandrterehin.hookahbook.app.theme.JetRortyTypography
import ru.alexandrterehin.hookahbook.data.model.tobacco.TobaccoDto
import ru.alexandrterehin.hookahbook.provider.AppResourceProvider
import ru.alexandrterehin.hookahbook.provider.ResourceProvider

@Composable
fun TobaccoRow(
    dto: TobaccoDto,
    onDetailClick: () -> Unit = {},
    provider: ResourceProvider
) {
    Card(
        modifier = Modifier
            .clickable { onDetailClick() }
            .fillMaxWidth()
            .height(100.dp)
            .padding(
                vertical = 4.dp,
                horizontal = 8.dp
            ),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Row {
            if (dto.iconUrl.isNotEmpty()) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(dto.iconUrl)
                        .crossfade(true)
                        .build(),
                    contentDescription = null,
                    modifier = Modifier
                        .size(74.dp)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(size = 8.dp))
                )
            } else {

                Image(
                    painterResource(id = provider.getResourceIdByName(dto.iconRes)),
                    contentDescription = null,
                    modifier = Modifier
                        .size(74.dp)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(size = 8.dp))
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, start = 4.dp, bottom = 4.dp)
            ) {
                Text(
                    text = dto.smell,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 2.dp),
                    style = JetRortyTypography.labelMedium
                )

            }
        }
    }
}

@Preview(
    showBackground = true,
    name = "Light mode"
)
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark mode"
)
@Composable
fun TobaccoRowPreview() {
    JetRortyTheme {
        TobaccoRow(dto = TobaccoDto.init(), provider = AppResourceProvider(LocalContext.current))
    }
}