package com.example.scipytonesk.network

import androidx.lifecycle.LiveData
import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


class CryptoApiService {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    }

private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()

    interface CryptoAPIService{
        @GET("v1/bpi/currentprice.json")
        suspend fun getCryptoData(): LiveData<CryptoData>

    }

    object{
        private const val BASE_URL ="https://api.coindesk.com"
    }

 }
