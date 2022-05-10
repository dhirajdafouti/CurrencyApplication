package com.project.currencyconvertorapplication.data.remote.dto.coin_details


import com.google.gson.annotations.SerializedName

data class Whitepaper(
    @SerializedName("link")
    val link: String,
    @SerializedName("thumbnail")
    val thumbnail: String,
)