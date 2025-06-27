package com.example.cafeemcasa.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Red,
    onPrimary = White,
    secondary = White10,
    onSecondary = Black,
    tertiary = LightBrown
)

private val LightColorScheme = lightColorScheme(
    primary = Red,
    onPrimary = White,
    secondary = White10,
    onSecondary = Black,
    tertiary = LightBrown,
    onBackground = Black,
    background = White
)

@Composable
fun CafeEmCasaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}