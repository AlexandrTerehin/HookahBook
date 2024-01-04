package ru.alexandrterehin.hookahbook.navigation.bottom

import androidx.annotation.DrawableRes
import ru.alexandrterehin.hookahbook.R
import ru.alexandrterehin.hookahbook.navigation.Routers

/**
 * Навигация нижнего меню
 *
 * @property title
 * @property iconId
 * @property route
 */
sealed class BottomItem(val title: String, @DrawableRes val iconId: Int, val route: String) {
    object ScreenHome : BottomItem("Основной", R.drawable.ic_24_home, Routers.SCREEN_HOME)
    object ScreenManufacturer :
        BottomItem("Производители", R.drawable.ic_24_manufacturing, Routers.SCREEN_MANUFACTURER)

    object ScreenSmell : BottomItem("Вкусы", R.drawable.ic_24_home, Routers.SCREEN_SMELL)
    object ScreenMix : BottomItem("Миксы", R.drawable.ic_24_home, Routers.SCREEN_MIX)

    companion object {
        /**
         * Список всех экранов
         */
        val listItems = listOf(
            ScreenHome,
            ScreenManufacturer,
            ScreenSmell,
            ScreenMix
        )
    }
}