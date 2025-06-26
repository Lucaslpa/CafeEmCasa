package com.example.cafeemcasa.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cafeemcasa.ui.theme.CafeEmCasaTheme


enum class AppButtonType {
    Primary,
    Secondary
}

@Composable
fun AppButton(text: String, onClick: () -> Unit, type: AppButtonType = AppButtonType.Primary, fillWidth : Boolean = true ) {
    val themes = mapOf(
        AppButtonType.Primary to mapOf(
            "backgroundColor" to MaterialTheme.colorScheme.primary,
            "textColor" to MaterialTheme.colorScheme.onPrimary
        ),
        AppButtonType.Secondary to mapOf(
            "backgroundColor" to MaterialTheme.colorScheme.secondary,
            "textColor" to MaterialTheme.colorScheme.onSecondary
        )
    )

    val buttonModifier = if (fillWidth) {
        Modifier.fillMaxWidth()
    } else {
        Modifier
    }

    val selectedTheme = themes[type] ?: themes[AppButtonType.Primary]!! // fallback
    val backgroundColor = selectedTheme["backgroundColor"]!!
    val textColor = selectedTheme["textColor"]!!

    Button(onClick = onClick,
        colors =  ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
        ),
        modifier = buttonModifier
    ) {
        Text(text, style = MaterialTheme.typography.titleMedium.copy(color = textColor))
    }

}



@Preview
@Composable
fun AppButtonPreview() {
    CafeEmCasaTheme {
        AppButton("Login with Google", type = AppButtonType.Primary, onClick = {})
    }
}