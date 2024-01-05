package ru.alexandrterehin.hookahbook.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import ru.alexandrterehin.hookahbook.navigation.bottom.AppBottomNavigation
import ru.alexandrterehin.hookahbook.provider.ResourceProvider

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(providerResources: ResourceProvider) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { AppBottomNavigation(navController = navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier.padding(
                bottom = paddingValues.calculateBottomPadding(),
                top = paddingValues.calculateTopPadding()
            )
        ) {
            NavGraph(
                navHostController = navController,
                providerResources = providerResources
            )
        }
    }
}