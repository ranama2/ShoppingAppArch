package com.example.shoppingapparch.data.Model.DogFact


import com.google.gson.annotations.SerializedName

data class DogFactModel(
    @SerializedName("facts")
    val facts: List<String?>?,
    @SerializedName("success")
    val success: Boolean?
)