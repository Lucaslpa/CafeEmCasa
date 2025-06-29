package com.example.cafeemcasa.data

import com.example.cafeemcasa.R
import com.example.cafeemcasa.models.Order
import com.example.cafeemcasa.models.Product
import com.example.cafeemcasa.models.Status
import com.example.cafeemcasa.models.StatusType


val products = listOf<Product>(
    Product(
        id = "1",
        name = "Latte",
        currency = "R$",
        value = 17.00,
        ingredients = listOf("Espresso", "Steamed Milk"),
        longDescription = "Latte is a creamy drink made with a shot of espresso and steamed milk, resulting in a smooth flavor and velvety texture. Ideal for those who enjoy coffee with milk.",
        shortDescription = "Espresso with steamed milk",
        image = R.drawable.latte
    ),
    Product(
        id = "2",
        name = "Cappuccino",
        currency = "R$",
        value = 14.00,
        ingredients = listOf("Espresso", "Steamed Milk", "Milk Foam"),
        longDescription = "Cappuccino combines espresso, steamed milk, and a generous layer of milk foam. Traditionally sprinkled with chocolate or cinnamon, it's perfect for those who like a balanced coffee.",
        shortDescription = "Espresso with steamed milk and foam"
    ),
    Product(
        id = "3",
        name = "Espresso",
        currency = "R$",
        value = 12.00,
        ingredients = listOf("Espresso"),
        longDescription = "Espresso is a strong and concentrated coffee, prepared under high pressure. It has an intense flavor and remarkable aroma, serving as the base for many other coffee drinks.",
        shortDescription = "Strong and concentrated coffee"
    )
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