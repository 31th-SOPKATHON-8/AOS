package com.sopt.sopkathon8aos.data.repository

import com.sopt.sopkathon8aos.data.entity.BrandEntity
import com.sopt.sopkathon8aos.data.entity.WrapperClass

interface HomeRepository {
    suspend fun getBrand(brandId: Int): Result<WrapperClass<BrandEntity>>
}
