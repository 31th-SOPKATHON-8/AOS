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
        favorViewModel.getFavor(0)
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
        favorViewModel.getFavor(index)
    }

    companion object {
        private val brandList = listOf(
            Brand(0, "파리바게트", R.drawable.ic_favor_paris),
            Brand(1, "남양유업", R.drawable.ic_favor_namyang),
            Brand(2, "미니스톱", R.drawable.ic_favor_mini),
            Brand(3, "삼성", R.drawable.ic_favor_samsung)
        )
    }
}
