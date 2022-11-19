package com.sopt.sopkathon8aos.data.entity

import kotlinx.serialization.Serializable

@Serializable
data class WrapperClass<T>(
    val status: Int,
    val message: String,
    val data: T? = null
)
