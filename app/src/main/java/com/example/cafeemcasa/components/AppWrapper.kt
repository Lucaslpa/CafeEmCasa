package com.example.cafeemcasa.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun AppWrapper(title: String, goBack: (() -> Unit)? = null , navController: NavHostController? = null,  content: @Composable () -> Unit) {
    Scaffold(
        bottomBar = {
            if(navController !== null) AppBottomBar(navController)
        },
        topBar = {
            AppHeader(title, goBack)
        },
        modifier = Modifier.background(MaterialTheme.colorScheme.background),
    ) { innerPadding ->
        Column(modifier = Modifier.background(Color.White).padding(top = innerPadding.calculateTopPadding()).padding(horizontal = 16.dp)) {
            content()
        }
    }
}