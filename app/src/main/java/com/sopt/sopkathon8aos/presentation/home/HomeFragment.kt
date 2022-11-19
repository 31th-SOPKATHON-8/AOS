package com.sopt.sopkathon8aos.presentation.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.sopt.sopkathon8aos.R
import com.sopt.sopkathon8aos.databinding.FragmentHomeBinding
import com.sopt.sopkathon8aos.presentation.brand.BrandActivity
import com.sopt.sopkathon8aos.presentation.posting.PostingActivity
import com.sopt.sopkathon8aos.util.binding.BindingFragment
import com.sopt.sopkathon8aos.util.extensions.setOnSingleClickListener

class HomeFragment : BindingFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initOnClickListener()
    }

    private fun initOnClickListener() {
        binding.layoutArticle1.clArticle.setOnSingleClickListener {
            startActivity(Intent(requireContext(), PostingActivity::class.java))
        }

        binding.ivBrand1.setOnSingleClickListener {
            startActivity(Intent(requireContext(), BrandActivity::class.java))
        }
    }
}
