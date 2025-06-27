package com.example.cafeemcasa.data

import com.example.cafeemcasa.R
import com.example.cafeemcasa.models.Product


val products = arrayOf<Product>(
    Product(title = "Latte", currency = "R$", value = 12.00, shortDescription = "Espresso with steamed milk", image = R.drawable.latte),
    Product(title = "Cappuccino", currency = "R$", value = 12.00, shortDescription = "Espresso with steamed milk and foam"),
    Product(title = "Espresso", currency = "R$", value = 12.00, shortDescription = "Strong and concentrated coffee")
)