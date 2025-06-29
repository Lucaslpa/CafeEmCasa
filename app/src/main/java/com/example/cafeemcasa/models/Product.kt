package com.example.cafeemcasa.models

import androidx.annotation.DrawableRes

class Product (
     val id: String,
     val name: String,
     @DrawableRes val image: Int? = null,
     val currency: String,
     val value: Double ,
     val shortDescription: String,
     val longDescription: String,
     val ingredients: List<String> = emptyList()
)