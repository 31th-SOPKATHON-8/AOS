package com.sopt.sopkathon8aos.presentation.posting

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sopt.sopkathon8aos.data.ResponsePostDTO
import com.sopt.sopkathon8aos.databinding.ItemPostingReviewBinding

class PostAdapter(context: Context, reviewList: List<ResponsePostDTO.Review>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val inflater by lazy { LayoutInflater.from(context) }
    val reviewList = reviewList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemPostingReviewBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewHolder) {
            holder.onBind(reviewList[position])
        }
    }

    override fun getItemCount() = reviewList.size

    inner class ViewHolder(
        private val binding: ItemPostingReviewBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: ResponsePostDTO.Review) {
            binding.tvPostingReviewUserNickname.text = data.nickname
            binding.tvPostingReviewContents.text = data.content
            binding.tvPostingReviewDate.text = data.commentCreatedAt
//            Glide.with(binding.root).load(data.Image).into(binding.ivPostingReviewUserImg)
        }
    }
}
