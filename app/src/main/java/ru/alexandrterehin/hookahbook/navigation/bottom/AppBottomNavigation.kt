package ru.alexandrterehin.hookahbook.navigation.bottom

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import ru.alexandrterehin.hookahbook.app.theme.BackgroundAccentColorDark
import ru.alexandrterehin.hookahbook.app.theme.BackgroundAdditionalColorDark
import ru.alexandrterehin.hookahbook.app.theme.BackgroundSelectedColorDark

@Composable
fun AppBottomNavigation(
    navController: NavController
) {
    NavigationBar(
        containerColor = BackgroundAdditionalColorDark
    ) {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route

        BottomItem.listItems.forEach { item ->
            NavigationBarItem(
                alwaysShowLabel = false,
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = item.iconId),
                        contentDescription = "icon",
                        tint = BackgroundAccentColorDark
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 9.sp
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = BackgroundSelectedColorDark,
                    unselectedIconColor = BackgroundAdditionalColorDark
                )
            )
        }
    }
}