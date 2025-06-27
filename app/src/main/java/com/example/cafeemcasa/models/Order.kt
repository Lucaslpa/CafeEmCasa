package com.example.cafeemcasa.models

enum class StatusType(val label: String) {
    Received("Order Received"),
    Preparation("In Preparation"),
    Delivery("Out for Delivery"),
    Delivered("Delivered")
}

class Status(
    val date : String,
    val time : String,
    val status : StatusType
)

class Order (
    var products: List<Product>,
    var totalCost: Double,
    var status: List<Status>,
)