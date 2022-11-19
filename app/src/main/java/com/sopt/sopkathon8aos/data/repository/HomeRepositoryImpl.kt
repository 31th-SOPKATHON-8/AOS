package com.sopt.sopkathon8aos.data.repository

import com.sopt.sopkathon8aos.data.source.remote.RemoteHomeDataSource
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    private val remoteHomeDataSource: RemoteHomeDataSource
) : HomeRepository
