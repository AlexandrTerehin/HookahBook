package ru.alexandrterehin.hookahbook.navigation

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import ru.alexandrterehin.hookahbook.navigation.bottom.AppBottomNavigation

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { AppBottomNavigation(navController = navController) }
    ) {
        // Размер отступ который занимает bottom bar
        NavGraph(navHostController = navController)
    }
}