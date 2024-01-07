package ru.alexandrterehin.hookahbook.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
import ru.alexandrterehin.hookahbook.app.theme.BackgroundBasicColorDark
import ru.alexandrterehin.hookahbook.app.theme.CellTextComment
import ru.alexandrterehin.hookahbook.app.theme.CellTextSubtitle
import ru.alexandrterehin.hookahbook.app.theme.CellTextTitle
import ru.alexandrterehin.hookahbook.app.theme.dimen12
import ru.alexandrterehin.hookahbook.app.theme.dimen16
import ru.alexandrterehin.hookahbook.app.theme.dimen4
import ru.alexandrterehin.hookahbook.app.theme.dimen40
import ru.alexandrterehin.hookahbook.data.test_data.DBModels
import ru.alexandrterehin.hookahbook.presentation.tobaccos.toCellModel

data class CellModel(
    @DrawableRes val imageRes: Int?,
    val imageDescription: String,
    val title: String,
    val subtitle: String,
    val comment: String
)

@Composable
fun CellComponent(
    data: CellModel
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.background(color = BackgroundBasicColorDark)
    ) {
        data.imageRes?.let { resId ->
            Image(
                painter = painterResource(id = resId),
                contentDescription = data.imageDescription,
                modifier = Modifier
                    .padding(top = dimen12, bottom = dimen12, end = dimen16)
                    .wrapContentSize()
                    .sizeIn(maxWidth = dimen40, maxHeight = dimen40)
            )
        }

        Column(modifier = Modifier.padding(vertical = dimen12)) {
            Text(
                text = data.title,
                style = CellTextTitle,
                modifier = Modifier.padding(bottom = dimen4)
            )

            Text(
                text = data.subtitle,
                style = CellTextSubtitle,
                modifier = Modifier.padding(bottom = dimen4)
            )

            Text(
                text = data.comment,
                style = CellTextComment
            )
        }
    }
}

@Preview
@Composable
fun CellComponentPreview() {
    val dto = DBModels.getTobacco()[0]

    CellComponent(
        data = dto.toCellModel()
    )
}