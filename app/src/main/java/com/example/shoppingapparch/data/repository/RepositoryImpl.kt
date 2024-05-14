package com.example.shoppingapplication.data.repository

import com.example.shoppingapparch.data.api.ApiEndpoints
import com.example.shoppingapparch.data.Model.DogFact.DogFactModel
import com.example.shoppingapplication.data.model.shoppinglist.ProductItemModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val apiDetails: ApiEndpoints
) : Repository {
    override suspend fun getDogFacts(): DogFactModel = apiDetails.getDogFacts()

    override suspend fun getProductList(): ArrayList<ProductItemModel> {
        return apiDetails.getProductList()
    }
}