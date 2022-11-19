package com.sopt.sopkathon8aos.presentation.favor

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.sopt.sopkathon8aos.R
import com.sopt.sopkathon8aos.data.entity.Brand
import com.sopt.sopkathon8aos.databinding.FragmentFavorBinding
import com.sopt.sopkathon8aos.util.binding.BindingFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavorFragment : BindingFragment<FragmentFavorBinding>(R.layout.fragment_favor) {
    private val favorViewModel by viewModels<FavorViewModel>()
    private val favorBodyAdapter = FavorBodyAdapter()
    private val favorHeaderAdapter = FavorHeaderAdapter(onClickHeader = ::onClickHeader)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        favorViewModel.getBrand(0)
    }

    private fun initAdapter() {
        binding.rcvFavorHeader.adapter = favorHeaderAdapter
        binding.rcvFavorBody.adapter = favorBodyAdapter
        favorViewModel.favorResult.observe(viewLifecycleOwner) { brand ->
            favorHeaderAdapter.submitList(brandList)
            favorBodyAdapter.submitList(brand.post)
        }
    }

    private fun onClickHeader(index: Int) {
        favorViewModel.getBrand(index)
    }

    companion object {
        private val brandList = listOf(
            Brand(0, "마켓컬리", 1),
            Brand(1, "파리바게트", 1),
            Brand(2, "남양유업", 1),
            Brand(3, "미니스톱", 1)
        )
    }
}
