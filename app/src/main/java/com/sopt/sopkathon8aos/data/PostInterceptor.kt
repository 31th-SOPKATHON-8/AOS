package com.sopt.sopkathon8aos.data

import okhttp3.Interceptor
import okhttp3.Response

class PostInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val headerRequest = originalRequest.newBuilder()
            .build()
        return chain.proceed(headerRequest)
    }
}
