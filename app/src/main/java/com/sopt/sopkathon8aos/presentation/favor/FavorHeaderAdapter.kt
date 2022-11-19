package com.sopt.sopkathon8aos.presentation.favor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sopt.sopkathon8aos.data.entity.Brand
import com.sopt.sopkathon8aos.databinding.ItemFavorHeaderBinding
import com.sopt.sopkathon8aos.util.extensions.ItemDiffCallback
import com.sopt.sopkathon8aos.util.extensions.setOnSingleClickListener

class FavorHeaderAdapter(
    private val onClickHeader: (Int) -> Unit
) :
    ListAdapter<Brand, FavorHeaderAdapter.FavorHeaderViewHolder>(
        favorHeaderDiffCallBack
    ) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavorHeaderViewHolder {
        val binding =
            ItemFavorHeaderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return FavorHeaderViewHolder(binding, onClickHeader)
    }

    override fun onBindViewHolder(holder: FavorHeaderViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    class FavorHeaderViewHolder(
        val binding: ItemFavorHeaderBinding,
        private val onClickHeader: (Int) -> Unit
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: Brand) {
            binding.data = data
            binding.clHeader.setOnSingleClickListener {
                onClickHeader(absoluteAdapterPosition)
            }
        }
    }

    companion object {
        private val favorHeaderDiffCallBack = ItemDiffCallback<Brand>(
            onItemsTheSame = { old, new -> old.brandId == new.brandId },
            onContentsTheSame = { old, new -> old == new }
        )
    }
}
