package com.example.core.models.network

import ErrorInterceptor
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.SocketTimeoutException


class ApiInstance {
    companion object {


        private val retrofitBuilder: Retrofit.Builder =
            Retrofit.Builder()
                .baseUrl("https://reqres.in/api/")
                .addConverterFactory(GsonConverterFactory.create())


        private val logging: HttpLoggingInterceptor
                = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BASIC)

        private var httpClient: OkHttpClient.Builder
                = OkHttpClient.Builder()

        private var retrofit:Retrofit = retrofitBuilder.build()

        fun <T> createService(serviceClass: Class<T>): T {

            if (!httpClient.interceptors().contains(logging)) {
                httpClient.addInterceptor(logging)
                    .addInterceptor(ErrorInterceptor())
                    .addInterceptor(MockInterceptor())
                retrofitBuilder.client(httpClient.build())
                retrofit = retrofitBuilder.build()
            }
            return retrofit.create(serviceClass)
        }




    }




}


