package ru.alexandrterehin.hookahbook.data.model.manufacturer

import androidx.annotation.DrawableRes

/**
 * Модель данных производителя табака DTO
 *
 * @property id идентификатор
 * @property name наименование производителя
 * @property image изображение
 */
data class ManufacturerDto(
    val id: Int,
    val name: String,
    @DrawableRes val image: Int
)
