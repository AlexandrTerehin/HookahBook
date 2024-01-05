package ru.alexandrterehin.hookahbook.presentation.models

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Информация об отступах для элементов
 *
 * @property start
 * @property top
 * @property end
 * @property bottom
 */
data class ComponentPaddings(
    var start: Dp = 0.dp,
    var top: Dp = 0.dp,
    var end: Dp = 0.dp,
    var bottom: Dp = 0.dp
)
