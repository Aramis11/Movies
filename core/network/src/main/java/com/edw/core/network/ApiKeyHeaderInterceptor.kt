package com.edw.core.network

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyHeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(with(chain.request().newBuilder()) {
            addHeader(
                "api_key",
                "de0a3c4d0726ba91bb86e2e950a2e99b"
            )
            build()
        })
    }
}