package com.sopt.sopkathon8aos.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BrandEntity(
    val brandId: Int,
    val brandName: String,
    val brandImage: String,
    val brandDescription: String,
    @SerialName("Post")
    val post: List<Post>
)
