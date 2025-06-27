package com.example.cafeemcasa.components

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.icons.outlined.LocalCafe
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.Receipt
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.cafeemcasa.ui.theme.CafeEmCasaTheme
import androidx.compose.runtime.getValue
import androidx.navigation.compose.rememberNavController


@Composable
fun AppBottomBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val itemColors = NavigationBarItemDefaults.colors(
        selectedIconColor = MaterialTheme.colorScheme.onBackground,
        selectedTextColor = MaterialTheme.colorScheme.onBackground,
        unselectedIconColor = MaterialTheme.colorScheme.tertiary,
        unselectedTextColor = MaterialTheme.colorScheme.tertiary,
        indicatorColor = MaterialTheme.colorScheme.background
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.background,
    ) {

        NavigationBarItem(
            selected = currentRoute == "menu",
            onClick = { navController.navigate("menu") },
            colors = itemColors,
            label = { Text("Menu", style = MaterialTheme.typography.labelSmall) },
            icon = { Icon(Icons.Outlined.LocalCafe, contentDescription = "Menu", modifier = Modifier.size(24.dp)) }
        )

        NavigationBarItem(
            selected = currentRoute == "orders",
            onClick = { navController.navigate("orders") },
            colors = itemColors,
            label = { Text("Orders", style = MaterialTheme.typography.labelSmall) },
            icon = { Icon(Icons.Outlined.Receipt, contentDescription = "Pedidos", modifier = Modifier.size(24.dp)) }
        )

        NavigationBarItem(
            selected = currentRoute == "profile",
            onClick = { navController.navigate("profile") },
            colors = itemColors,
            label = { Text("Profile", style = MaterialTheme.typography.labelSmall) },
            icon = { Icon(Icons.Outlined.PersonOutline, contentDescription = "Perfil", modifier = Modifier.size(24.dp)) }
        )
    }
}


@Preview
@Composable
fun AppBottomBarPreview() {
    val navController = rememberNavController()
    CafeEmCasaTheme {
        AppBottomBar(navController)
    }
}