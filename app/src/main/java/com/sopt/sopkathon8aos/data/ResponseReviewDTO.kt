package com.sopt.sopkathon8aos.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseReviewDTO(
    @SerialName("status")
    val status: Int,
    @SerialName("success")
    val success: Boolean,
    @SerialName("message")
    val message: String,
    @SerialName("data")
    val data: Review
) {
    @Serializable
    data class Review(
        @SerialName("commentId")
        val commentId: Int,
        @SerialName("nickname")
        val nickname: String,
        @SerialName("content")
        val content: String?,
        @SerialName("postId")
        val postId: Int,
        @SerialName("commentCreatedAt")
        val commentCreatedAt: String
    )
}