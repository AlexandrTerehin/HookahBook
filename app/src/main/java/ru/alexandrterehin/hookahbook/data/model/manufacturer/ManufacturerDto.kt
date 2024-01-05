package ru.alexandrterehin.hookahbook.data.model.manufacturer

import androidx.annotation.DrawableRes
import ru.alexandrterehin.hookahbook.R

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
) {
    companion object {
        fun initDarkside() = ManufacturerDto(
            id = 1,
            name = "Darkside",
            image = R.drawable.il_manufacturer_darkside
        )

        fun initBlackburn() = ManufacturerDto(
            id = 1,
            name = "BlackBurn",
            image = R.drawable.il_manufacturer_blackburn
        )
    }
}
