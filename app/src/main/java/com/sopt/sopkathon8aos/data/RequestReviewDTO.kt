package com.sopt.sopkathon8aos.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RequestReviewDTO(
    @SerialName("nickname")
    val nickname: String,
    @SerialName("content")
    val content: String,
    @SerialName("postId")
    val postId: Int,
    @SerialName("commentCreatedAt")
    val commentCreatedAt: String
)
