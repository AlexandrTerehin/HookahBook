package ru.alexandrterehin.hookahbook.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ru.alexandrterehin.hookahbook.R
import ru.alexandrterehin.hookahbook.app.theme.BackgroundBasicColorDark
import ru.alexandrterehin.hookahbook.app.theme.TextPrimaryColorDark
import ru.alexandrterehin.hookahbook.app.theme.dimen12
import ru.alexandrterehin.hookahbook.app.theme.dimen16
import ru.alexandrterehin.hookahbook.app.theme.dimen20
import ru.alexandrterehin.hookahbook.app.theme.dimen40

data class CellModel(
    @DrawableRes val imageRes: Int,
    val imageDescription: String,
    val title: String
)

@Composable
fun CellComponent(
    data: CellModel
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.background(color = BackgroundBasicColorDark)
    ) {
        Image(
            painter = painterResource(id = data.imageRes),
            contentDescription = data.imageDescription,
            modifier = Modifier
                .padding(vertical = dimen12)
                .wrapContentSize()
                .sizeIn(maxWidth = dimen40, maxHeight = dimen40)
        )

        Text(
            text = data.title,
            color = TextPrimaryColorDark,
            modifier = Modifier
                .padding(
                    start = dimen16,
                    top = dimen20,
                    bottom = dimen20
                )
        )
    }
}

@Preview
@Composable
fun CellComponentPreview() {
    CellComponent(
        data = CellModel(
            imageRes = R.drawable.il_tobacco_admiral_acbar,
            imageDescription = "Табак admiral acbar",
            title = "ADMIRAL ACBAR CEREAL — овсяная каша"
        )
    )
}