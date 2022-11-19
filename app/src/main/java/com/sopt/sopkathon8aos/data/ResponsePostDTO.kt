package com.sopt.sopkathon8aos.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponsePostDTO(
    @SerialName("status")
    val status: Int,
    @SerialName("message")
    val message: String,
    @SerialName("data")
    val data: List<Post>
) {
    @Serializable
    data class Post(
        @SerialName("postTitle")
        val postTitle: String,
        @SerialName("postContent")
        val postContent: String,
        @SerialName("postImage")
        val postImage: String,
        @SerialName("createdAt")
        val createdAt: String,
        @SerialName("Comment")
        val Comment: List<Review>
    )
    @Serializable
    data class Review(
        @SerialName("nickname")
        val nickname: String,
        @SerialName("content")
        val content: String,
        @SerialName("Image")
        val Image: String? = null,
        @SerialName("commentCreatedAt")
        val commentCreatedAt: String
    )
}