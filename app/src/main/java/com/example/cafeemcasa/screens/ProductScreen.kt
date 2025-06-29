package com.example.cafeemcasa.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cafeemcasa.R
import com.example.cafeemcasa.components.AppButton
import com.example.cafeemcasa.components.AppWrapper
import com.example.cafeemcasa.data.products
import com.example.cafeemcasa.ui.theme.CafeEmCasaTheme

@Composable
fun ProductScreen(productId: String, onBackToMenu : () -> Unit = {}) {
   val product = products.find( { it.id == productId })
   if( product == null) {
      Text(text = "Product not found")
      return
   }
   AppWrapper(
       title = "Café em Casa",
       goBack = onBackToMenu
   ) {
      Column {
         Image(
            painter = painterResource(id = product.image ?: R.drawable.ic_launcher_background),
            contentDescription = "Product Image",
            modifier = Modifier.fillMaxWidth().height(218.dp)
         )
         Spacer(modifier = Modifier.height(20.dp))
         Text(
            text = product.name,
            style = MaterialTheme.typography.titleLarge
         )
         Spacer(modifier = Modifier.height(3.dp))
         Text(
            text = product.shortDescription,
            style = MaterialTheme.typography.displayLarge
         )
         Spacer(modifier = Modifier.height(10.dp))
         Text(
            text = "Price: ${product.currency} ${product.value}",
            style = MaterialTheme.typography.titleMedium
         )
         Spacer(modifier = Modifier.height(10.dp))
         Text(
            text = "Ingredients",
            style = MaterialTheme.typography.titleMedium
         )
         Spacer(modifier = Modifier.height(3.dp))
         Text(
            text = product.ingredients.joinToString(", "),
            style = MaterialTheme.typography.bodyLarge
         )
         Spacer(modifier = Modifier.height(20.dp))
         Text(
            text = "Description",
            style = MaterialTheme.typography.titleMedium
         )
         Spacer(modifier = Modifier.height(3.dp))
         Text(
            text = product.longDescription,
            style = MaterialTheme.typography.bodyLarge
         )
         Spacer(modifier = Modifier.weight(1f))
         AppButton(
            text = "Buy Now",
            onClick = { /* Handle add to cart */ },
            fillWidth = true
         )
         Spacer(modifier = Modifier.height(32.dp))
      }
   }
}

@Preview
@Composable
fun ProductScreenPreview() {
   CafeEmCasaTheme {
      ProductScreen("1")
   }
}