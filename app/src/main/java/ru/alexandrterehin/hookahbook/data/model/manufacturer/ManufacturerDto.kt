package ru.alexandrterehin.hookahbook.data.model.manufacturer

/**
 * Модель данных производителя табака DTO
 *
 * @property id идентификатор
 * @property name наименование производителя
 */
data class ManufacturerDto(
    val id: Int,
    val name: String,
) {
    companion object {
        fun init() = ManufacturerDto(
            id = 1,
            name = "Darkside"
        )
    }
}
