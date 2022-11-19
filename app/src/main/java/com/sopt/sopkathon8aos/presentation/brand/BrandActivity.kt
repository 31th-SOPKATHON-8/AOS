package com.sopt.sopkathon8aos.presentation.brand

import android.os.Bundle
import androidx.activity.viewModels
import com.sopt.sopkathon8aos.R
import com.sopt.sopkathon8aos.databinding.ActivityBrandBinding
import com.sopt.sopkathon8aos.presentation.favor.FavorBodyAdapter
import com.sopt.sopkathon8aos.util.binding.BindingActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BrandActivity : BindingActivity<ActivityBrandBinding>(R.layout.activity_brand) {
    private val brandViewModel: BrandViewModel by viewModels()
    private val favorBodyAdapter = FavorBodyAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.vm = brandViewModel
        initAdapter()
        brandViewModel.getBrand(0)
    }

    private fun initAdapter() {
        binding.rcvBrandBody.adapter = favorBodyAdapter
        brandViewModel.brandResult.observe(this) { brand ->
            favorBodyAdapter.submitList(brand.post)
        }
    }
}
