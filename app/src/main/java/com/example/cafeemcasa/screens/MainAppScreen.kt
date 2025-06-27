package com.example.cafeemcasa.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.cafeemcasa.components.AppWrapper

@Composable
fun MainAppScreen() {
    val contentNavController = rememberNavController()
    var currentTitle by remember { mutableStateOf("") }
    val navBackStackEntry by contentNavController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    currentTitle = when (currentRoute) {
        "orders" -> "Your Order"
        "profile" -> "Account"
        else -> "Café em Casa"
    }

    AppWrapper(title = currentTitle, navController = contentNavController) {
        NavHost(
            navController = contentNavController,
            startDestination = "menu",
        ) {
            composable("menu") {
                MenuScreen()
            }
            composable("orders") {
                OrderStatusScreen()
            }
            composable("profile") {
                 ProfileScreen()
            }
        }
    }
}