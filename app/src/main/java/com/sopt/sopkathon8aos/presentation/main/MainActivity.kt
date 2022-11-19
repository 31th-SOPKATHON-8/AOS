package com.sopt.sopkathon8aos.presentation.main

import android.os.Bundle
import com.sopt.sopkathon8aos.R
import com.sopt.sopkathon8aos.databinding.ActivityMainBinding
import com.sopt.sopkathon8aos.util.binding.BindingActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
