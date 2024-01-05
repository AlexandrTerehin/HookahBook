package ru.alexandrterehin.hookahbook.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.alexandrterehin.hookahbook.app.theme.HookahBookTheme
import ru.alexandrterehin.hookahbook.navigation.MainScreen
import ru.alexandrterehin.hookahbook.provider.AppResourceProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HookahBookTheme {
                MainScreen(providerResources = AppResourceProvider(context = this))
            }
        }
    }
}