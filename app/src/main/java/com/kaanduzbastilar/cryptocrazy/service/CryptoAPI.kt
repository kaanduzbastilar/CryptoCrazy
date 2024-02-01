package com.kaanduzbastilar.cryptocrazy.service

import retrofit2.http.GET

interface CryptoAPI {

    //https://raw.githubusercontent.com/atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json

    //https://raw.githubusercontent.com/atilsamancioglu/IA32-CryptoComposeData/main/crypto.json

    @GET("prices")
    suspend fun getCryptoList() : Unit

    @GET()

}