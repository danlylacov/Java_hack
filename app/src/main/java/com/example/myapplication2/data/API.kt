package com.example.myapplication2.data

import retrofit2.Response
import retrofit2.http.GET

interface API {

    @GET("/number")
    suspend fun getAmount(): Response<Int>

}