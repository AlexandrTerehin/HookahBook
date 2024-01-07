package ru.alexandrterehin.hookahbook.presentation.tobaccos

import ru.alexandrterehin.hookahbook.data.model.tobacco.TobaccoDto
import ru.alexandrterehin.hookahbook.ui.components.CellModel

fun TobaccoDto.toCellModel() = CellModel(
    imageRes = getDrawableId(),
    imageDescription = name,
    title = name,
    subtitle = "произовитель ${manufacturer.name}",
    comment = "крепость $strength"
)