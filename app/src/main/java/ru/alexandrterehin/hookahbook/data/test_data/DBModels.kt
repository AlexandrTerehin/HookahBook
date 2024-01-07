package ru.alexandrterehin.hookahbook.data.test_data

import ru.alexandrterehin.hookahbook.R
import ru.alexandrterehin.hookahbook.data.model.manufacturer.ManufacturerDto
import ru.alexandrterehin.hookahbook.data.model.tobacco.TobaccoDto

object DBModels {
    fun getManufacturer() = listOf(
        ManufacturerDto(
            id = 1,
            name = "Darkside",
            image = R.drawable.il_manufacturer_darkside
        ),
        ManufacturerDto(
            id = 2,
            name = "BlackBurn",
            image = R.drawable.il_manufacturer_blackburn
        )
    )

    fun getTobacco() = listOf(
        TobaccoDto(
            id = 1,
            name = "ADMIRAL ACBAR CEREAL — овсяная каша",
            iconUrl = "",
            iconRes = "il_tobacco_admiral_acbar",
            manufacturer = getManufacturer().first { dto -> dto.name == "Darkside" },
            strength = 2
        ),
        TobaccoDto(
            id = 2,
            name = "Cherry Shock - Кислая вишня",
            iconUrl = "",
            iconRes = "il_tobacco_cherry_shock",
            manufacturer = getManufacturer().first { dto -> dto.name == "BlackBurn" },
            strength = 2
        )
    )
}