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
import ru.alexandrterehin.hookahbook.provider.ResourceProvider

@Composable
fun NavGraph(
    navHostController: NavHostController,
    providerResources: ResourceProvider
) {
    NavHost(
        navController = navHostController,
        startDestination = BottomItem.ScreenHome.route
    ) {
        composable(BottomItem.ScreenHome.route) {
            ScreenHome(providerResources = providerResources)
        }
        composable(BottomItem.ScreenManufacturer.route) {
            ScreenManufacturer(providerResources = providerResources)
        }
        composable(BottomItem.ScreenSmell.route) {
            ScreenTobaccos(providerResources = providerResources)
        }
        composable(BottomItem.ScreenMix.route) {
            ScreenMix(providerResources = providerResources)
        }
    }
}