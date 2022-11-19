package com.sopt.sopkathon8aos.data.entity

data class Post(
    val postId: Int,
    val postTitle: String,
    val postContent: String,
    val createdAt: String,
    val like: Int,
    val comment: Int
)
