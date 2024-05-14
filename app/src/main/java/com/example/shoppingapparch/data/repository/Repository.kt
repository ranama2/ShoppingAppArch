package com.example.shoppingapplication.data.repository

import com.example.shoppingapparch.data.Model.DogFact.DogFactModel
import com.example.shoppingapplication.data.model.shoppinglist.ProductItemModel

interface Repository {

    suspend fun getDogFacts(): DogFactModel

    suspend fun getProductList(): ArrayList<ProductItemModel>
}