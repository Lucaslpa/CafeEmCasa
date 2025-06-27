package com.example.cafeemcasa.router
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cafeemcasa.screens.LoginScreen
import com.example.cafeemcasa.screens.MainAppScreen


@Preview
@Composable
fun AppRouter() {

    val appNavController = rememberNavController()

    NavHost(navController = appNavController, startDestination = "login") {
        composable("login") {
            LoginScreen(onSuccessfulLogin = {
                appNavController.navigate("main") {
                    popUpTo("login") { inclusive = true }
                }
            })
        }

        composable("main") {
            MainAppScreen()
        }
    }
}