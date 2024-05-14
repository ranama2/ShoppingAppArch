package com.example.shoppingapparch.data.api

import com.example.shoppingapparch.data.Model.DogFact.DogFactModel
import com.example.shoppingapplication.data.api.ApiDetail
import com.example.shoppingapplication.data.model.shoppinglist.ProductItemModel
import retrofit2.http.GET

interface ApiEndpoints {

    @GET(ApiDetail.DOG_FACT_ENDPOINT)
    suspend fun getDogFacts(): DogFactModel

    @GET(ApiDetail.PRODUCT_LIST_ENDPOINT)
    suspend fun getProductList(): ArrayList<ProductItemModel>

}