import okhttp3.Interceptor
import okhttp3.Protocol
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody
import java.net.SocketTimeoutException

class ErrorInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()

        try {
            val response = chain.proceed(request)
            val bodyString = response.body!!.string()

            return response.newBuilder()
                .body(bodyString.toResponseBody(response.body?.contentType()))
                .build()
        } catch (e: Exception) {
            var msg = ""
            var interceptorCode: Int = 201

            when (e) {
                is SocketTimeoutException -> {

                    msg = "Socket timeout error"
                    interceptorCode = 408

                }

            }

            return Response.Builder()
                .request(request)
                .protocol(Protocol.HTTP_1_1)
                .code(interceptorCode)
                .message(msg)
                .body("{${e}}".toResponseBody(null)).build()
        }
    }
}