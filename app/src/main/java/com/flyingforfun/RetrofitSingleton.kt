package com.flyingforfun

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitSingleton {
    val BASE_URL = "https://test.api.amadeus.com/v1/security/oauth2/token"
    val retrofit : Retrofit

    var token : String

    init {
        val gson : Gson = GsonBuilder().create()

        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        token = retrofit.create
    }
}
