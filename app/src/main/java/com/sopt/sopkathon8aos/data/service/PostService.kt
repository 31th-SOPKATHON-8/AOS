package com.sopt.sopkathon8aos.data.service

import com.sopt.sopkathon8aos.data.RequestReviewDTO
import com.sopt.sopkathon8aos.data.ResponsePostDTO
import com.sopt.sopkathon8aos.data.ResponseReviewDTO
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface PostService {
    @GET("post/{postId}")
    fun getPost(
        @Path("postId") postId: Int
    ): Call<ResponsePostDTO>

    @POST("post/comment")
    fun addReview(
        @Body request: RequestReviewDTO
    ): Call<ResponseReviewDTO>
}