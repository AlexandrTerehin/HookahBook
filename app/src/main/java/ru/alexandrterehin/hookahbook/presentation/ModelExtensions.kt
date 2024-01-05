package ru.alexandrterehin.hookahbook.presentation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.dp
import ru.alexandrterehin.hookahbook.presentation.models.ComponentPaddings

/**
 * Создать модель с отступом по всем краям
 *
 */
fun Int.toPaddings() =
    ComponentPaddings(start = this.dp, top = this.dp, end = this.dp, bottom = this.dp)

/**
 * Создать модель с отступом по вертикальным краям
 *
 */
fun Int.toVerticalPaddings() =
    ComponentPaddings(start = 0.dp, top = this.dp, end = 0.dp, bottom = this.dp)

/**
 * Создать модель с отступом по горизонтальным краям
 *
 */
fun Int.toHorizontalPaddings() =
    ComponentPaddings(start = this.dp, top = 0.dp, end = this.dp, bottom = 0.dp)

fun Int.toRightPaddings() =
    ComponentPaddings(start = 0.dp, top = 0.dp, end = this.dp, bottom = 0.dp)

fun Int.toLeftPaddings() =
    ComponentPaddings(start = this.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)

fun ComponentPaddings.toPaddingValues() =
    PaddingValues(start = this.start, top = this.top, end = this.end, bottom = this.bottom)