package ru.alexandrterehin.hookahbook.data.model.tobacco

import ru.alexandrterehin.hookahbook.data.model.manufacturer.ManufacturerDto

/**
 * Модель данных табак DTO
 *
 * @property id идентификатор
 * @property smell наименование вкуса
 * @property iconUrl ссылка на иконку
 * @property iconRes ссылка на ресурс
 * @property manufacturer производитель
 * @property strength крепость табака
 */
data class TobaccoDto(
    val id: Int,
    val smell: String,
    val iconUrl: String,
    val iconRes: String,
    val manufacturer: ManufacturerDto,
    val strength: TobaccoStrengthDto
) {
    companion object {
        fun init() = TobaccoDto(
            id = 1,
            smell = "ADMIRAL ACBAR CEREAL — овсяная каша",
            iconUrl = "https://htreviews.org/uploads/objects/0/b4ad52985db996a54fee2e4502b918df73bf274b.webp",
            iconRes = "",
            manufacturer = ManufacturerDto.initDarkside(),
            strength = TobaccoStrengthDto.LIGHT
        )
    }
}
