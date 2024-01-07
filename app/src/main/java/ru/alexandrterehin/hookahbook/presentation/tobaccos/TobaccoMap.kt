package ru.alexandrterehin.hookahbook.presentation.tobaccos

import ru.alexandrterehin.hookahbook.R
import ru.alexandrterehin.hookahbook.data.model.tobacco.TobaccoDto

private val tobaccoMapDrawable = mapOf(
    "il_tobacco_admiral_acbar" to R.drawable.il_tobacco_admiral_acbar,
    "il_tobacco_cherry_shock" to R.drawable.il_tobacco_cherry_shock
)

/**
 * Получить иконку табака из ресурсов
 *
 * @return
 */
fun TobaccoDto.getDrawableId(): Int? = tobaccoMapDrawable[iconRes]