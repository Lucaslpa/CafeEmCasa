package com.example.cafeemcasa.models

import androidx.annotation.DrawableRes

class Product (
     val title: String,
     @DrawableRes val image: Int? = null,
     val currency: String,
     val value: Double ,
     val shortDescription: String,
)