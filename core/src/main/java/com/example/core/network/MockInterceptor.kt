package com.example.core.models.network

import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Protocol
import okhttp3.Response
import okhttp3.ResponseBody
import java.net.URI


class MockInterceptor:Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
            val uri: URI = chain.request().url.toUri()
            val path: String = uri.path

        if (path.startsWith("/api/restaurants"))
        {
            return buildMockResponse(chain, "{\n" +
                    "\"id\":1,\n" +
                    "\"title\":\"title\",\n" +
                    "\"lat\":\"1\",\n" +
                    "\"lng\":\"2\"\n" +
                    "}" )
        }

        return chain.proceed(chain.request())

    }

    private fun buildMockResponse(chain: Interceptor.Chain, response: String): Response {
        return Response.Builder()
            .code(200)
            .message(response)
            .request(chain.request())
            .protocol(Protocol.HTTP_1_0)
            .body(ResponseBody.create("application/json".toMediaType(), response.toByteArray()))
            .addHeader("content-type", "application/json")
            .build()
    }
}