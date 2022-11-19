package com.sopt.sopkathon8aos.data.entity

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val postId: Int,
    val postTitle: String,
    val postContent: String,
    val createdAt: String,
    val postImage: String,
    val postComment: Int,
    val postLike: Int
)
