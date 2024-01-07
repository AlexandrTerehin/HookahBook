package ru.alexandrterehin.hookahbook.data.model.tobacco

import ru.alexandrterehin.hookahbook.data.model.manufacturer.ManufacturerDto

/**
 * Модель данных табак DTO
 *
 * @property id идентификатор
 * @property name наименование вкуса
 * @property iconUrl ссылка на иконку
 * @property iconRes ссылка на ресурс
 * @property manufacturer производитель
 * @property strength крепость табака
 */
data class TobaccoDto(
    val id: Int,
    val name: String,
    val iconUrl: String,
    val iconRes: String,
    val manufacturer: ManufacturerDto,
    val strength: Int
)
