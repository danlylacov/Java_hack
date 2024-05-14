package com.example.myapplication2.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkService {
    val retrofit = Retrofit.Builder()
    .baseUrl("http://127.0.0.1:8000")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

    val api = retrofit.create(API::class.java)
}