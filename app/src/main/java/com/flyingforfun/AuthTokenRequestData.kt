package com.flyingforfun

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AuthTokenRequestData(
    val grant_type : String, val client_id : String, val client_secret : String) : Serializable {

}