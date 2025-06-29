package com.example.cafeemcasa.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cafeemcasa.R
import com.example.cafeemcasa.data.products
import com.example.cafeemcasa.models.Product
import com.example.cafeemcasa.ui.theme.CafeEmCasaTheme
import androidx.compose.foundation.lazy.items

@Composable
fun MenuScreen(onSelectProduct : (Product) -> Unit = {}) {
    val  categories = arrayOf("Coffees", "Iced\n" + "Drinks", "Snacks", "Desserts", "Beverages")

    Column {
          Box(modifier = Modifier.height(70.dp).fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
              Text(
                  "Menu",
                  style = MaterialTheme.typography.titleLarge,
              )
          }
          LazyRow(
              horizontalArrangement = Arrangement.spacedBy(32.dp),
              modifier = Modifier.fillMaxWidth()
          ) {
              categories.forEach {
                  item {
                      ProductCategory(it, isSelected = false, onSelectProduct)
                  }
              }
          }
          LazyColumn {
              items(products) {
                      product -> ProductCard(product , onClick = { onSelectProduct(product) })
              }
          }
      }
}


@Composable
fun ProductCategory(title: String, isSelected: Boolean = false, onSelectProduct: (Product) -> Unit) {
 Box(
     modifier = Modifier.height(74.dp),
     contentAlignment = Alignment.Center
 ) {
     Text(title, style = MaterialTheme.typography.titleSmall, color = if (isSelected) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.tertiary)
 }
}

@Composable
fun ProductCard(product: Product, onClick: () -> Unit = {}) {
    Row(modifier = Modifier.padding(vertical = 12.dp).clickable { onClick() }) {
        Image(painter = painterResource(id = product.image ?: R.drawable.ic_launcher_background), contentDescription = product.name, modifier = Modifier.height(70.dp).width(70.dp).clip(RoundedCornerShape(8.dp)) )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
                Text( product.name, style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(2.dp))
                Text("${product.currency} ${product.value}", style = MaterialTheme.typography.displayMedium, color = MaterialTheme.colorScheme.tertiary)
                Spacer(modifier = Modifier.height(2.dp))
                Text(product.shortDescription, style = MaterialTheme.typography.displayMedium , color = MaterialTheme.colorScheme.tertiary)
            }
    }
}


@Preview
@Composable
fun MenuScreenPreview() {
    CafeEmCasaTheme {
        MenuScreen()
    }
}