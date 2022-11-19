package com.sopt.sopkathon8aos.data.source.local

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalPrefDataSource @Inject constructor(
    private val prefs: SharedPreferences
)
