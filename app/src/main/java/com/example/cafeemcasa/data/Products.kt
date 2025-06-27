package com.example.cafeemcasa.data

import com.example.cafeemcasa.R
import com.example.cafeemcasa.models.Order
import com.example.cafeemcasa.models.Product
import com.example.cafeemcasa.models.Status
import com.example.cafeemcasa.models.StatusType


val products = listOf<Product>(
    Product(title = "Latte", currency = "R$", value = 12.00, shortDescription = "Espresso with steamed milk", image = R.drawable.latte),
    Product(title = "Cappuccino", currency = "R$", value = 12.00, shortDescription = "Espresso with steamed milk and foam"),
    Product(title = "Espresso", currency = "R$", value = 12.00, shortDescription = "Strong and concentrated coffee")
)


val order = Order(
    products = products,
 totalCost = 100.00,
    status = listOf<Status>(
        Status(date = "26/02/2025", time = "10:00 AM", status = StatusType.Received),
        Status(date = "26/02/2025", time = "10:15 AM", status = StatusType.Preparation),
        Status(date = "26/02/2025", time = "10:30 AM", status = StatusType.Delivery),
        Status(date = "26/02/2025", time = "10:45 AM", status = StatusType.Delivered),
        )
)