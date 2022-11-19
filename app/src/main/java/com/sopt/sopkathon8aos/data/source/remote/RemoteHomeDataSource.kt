package com.sopt.sopkathon8aos.data.source.remote

import com.sopt.sopkathon8aos.data.service.HomeService
import javax.inject.Inject

class RemoteHomeDataSource @Inject constructor(
    private val homeService: HomeService
)
