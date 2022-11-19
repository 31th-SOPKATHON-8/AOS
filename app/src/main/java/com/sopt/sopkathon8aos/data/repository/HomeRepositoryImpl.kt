package com.sopt.sopkathon8aos.data.repository

import com.sopt.sopkathon8aos.data.entity.BrandEntity
import com.sopt.sopkathon8aos.data.entity.WrapperClass
import com.sopt.sopkathon8aos.data.source.remote.RemoteHomeDataSource
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    private val remoteHomeDataSource: RemoteHomeDataSource
) : HomeRepository {
    override suspend fun getBrand(brandId: Int): Result<WrapperClass<BrandEntity>> =
        runCatching { remoteHomeDataSource.getBrand(brandId) }
}
