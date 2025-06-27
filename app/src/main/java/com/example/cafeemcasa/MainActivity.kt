package com.example.cafeemcasa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.cafeemcasa.router.AppRouter
import com.example.cafeemcasa.screens.MenuScreen
import com.example.cafeemcasa.ui.theme.CafeEmCasaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CafeEmCasaTheme {
                AppRouter()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CafeEmCasaTheme {
        MenuScreen()
    }
}