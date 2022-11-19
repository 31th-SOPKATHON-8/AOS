package com.sopt.sopkathon8aos.presentation.brand

import android.os.Bundle
import androidx.activity.viewModels
import com.sopt.sopkathon8aos.R
import com.sopt.sopkathon8aos.databinding.ActivityBrandBinding
import com.sopt.sopkathon8aos.util.binding.BindingActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BrandActivity : BindingActivity<ActivityBrandBinding>(R.layout.activity_brand) {
    private val brandViewModel: BrandViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.vm = brandViewModel
        brandViewModel.getBrand(0)
    }
}
