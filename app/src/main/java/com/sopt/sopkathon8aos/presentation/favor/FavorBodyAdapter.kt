package com.sopt.sopkathon8aos.presentation.favor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sopt.sopkathon8aos.data.entity.Post
import com.sopt.sopkathon8aos.databinding.ItemFavorBodyBinding
import com.sopt.sopkathon8aos.util.extensions.ItemDiffCallback

class FavorBodyAdapter :
    ListAdapter<Post, FavorBodyAdapter.FavorBodyViewHolder>(
        favorBodyDiffCallBack
    ) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavorBodyViewHolder {
        val binding =
            ItemFavorBodyBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return FavorBodyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavorBodyViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    class FavorBodyViewHolder(
        val binding: ItemFavorBodyBinding
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: Post) {
            binding.data = data
        }
    }

    companion object {
        private val favorBodyDiffCallBack = ItemDiffCallback<Post>(
            onItemsTheSame = { old, new -> old.postId == new.postId },
            onContentsTheSame = { old, new -> old == new }
        )
    }
}
