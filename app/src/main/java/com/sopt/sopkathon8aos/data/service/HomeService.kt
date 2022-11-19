package com.sopt.sopkathon8aos.data.service

import com.sopt.sopkathon8aos.data.entity.BrandEntity
import com.sopt.sopkathon8aos.data.entity.WrapperClass
import retrofit2.http.GET
import retrofit2.http.Path

interface HomeService {
    @GET("brand/{brandId}")
    suspend fun getBrand(@Path("brandId") brandId: Int): WrapperClass<BrandEntity>
}
