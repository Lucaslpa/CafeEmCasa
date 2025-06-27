package com.example.cafeemcasa.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun AppWrapper(title: String, navController: NavHostController, content: @Composable () -> Unit) {
    Scaffold(
        bottomBar = {
            AppBottomBar(navController)
        },
        topBar = {
            AppHeader(title)
        }
    ) { innerPadding ->
        Column(modifier = Modifier.background(Color.White).padding(top = innerPadding.calculateTopPadding()).padding(horizontal = 16.dp)) {
            content()
        }
    }
}