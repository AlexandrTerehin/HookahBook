package ru.alexandrterehin.hookahbook.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.alexandrterehin.hookahbook.navigation.bottom.BottomItem
import ru.alexandrterehin.hookahbook.presentation.main.ScreenHome
import ru.alexandrterehin.hookahbook.presentation.manufacturer.ScreenManufacturer
import ru.alexandrterehin.hookahbook.presentation.mix.ScreenMix
import ru.alexandrterehin.hookahbook.presentation.tobaccos.ScreenTobaccos

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = BottomItem.ScreenHome.route
    ) {
        composable(BottomItem.ScreenHome.route) {
            ScreenHome()
        }
        composable(BottomItem.ScreenManufacturer.route) {
            ScreenManufacturer()
        }
        composable(BottomItem.ScreenSmell.route) {
            ScreenTobaccos()
        }
        composable(BottomItem.ScreenMix.route) {
            ScreenMix()
        }
    }
}