package com.example.cafeemcasa.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cafeemcasa.ui.theme.CafeEmCasaTheme


@Composable
fun ProfileScreen() {
    Column {
        Column {
            Box(
                modifier = Modifier.height(60.dp).padding(top = 20.dp)
            ) {
                Text("Favorites", style = MaterialTheme.typography.titleLarge)
            }
            Row(modifier = Modifier.height(72.dp).padding(vertical = 13.dp), verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                Column {
                    Text("Coffee", style = MaterialTheme.typography.bodyLarge)
                    Text("Cappuccino", style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.tertiary)
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(Icons.Filled.Favorite, contentDescription = "Favorite", tint = Color.Red)
            }
            Row(modifier = Modifier.height(72.dp).padding(vertical = 13.dp), verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                Column {
                    Text("Coffee", style = MaterialTheme.typography.bodyLarge)
                    Text("Cappuccino", style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.tertiary)
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(Icons.Filled.Favorite, contentDescription = "Favorite", tint = Color.Red)
            }
        }
    }
}
@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
fun ProfileScreenPreview() {
    CafeEmCasaTheme {
        ProfileScreen()
    }
}