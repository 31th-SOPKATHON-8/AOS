package com.sopt.sopkathon8aos.presentation.posting

import android.os.Bundle
import android.util.Log
import com.sopt.sopkathon8aos.R
import com.sopt.sopkathon8aos.data.RequestReviewDTO
import com.sopt.sopkathon8aos.data.ResponsePostDTO
import com.sopt.sopkathon8aos.data.ResponseReviewDTO
import com.sopt.sopkathon8aos.data.ServicePool
import com.sopt.sopkathon8aos.databinding.ActivityPostingBinding
import com.sopt.sopkathon8aos.util.binding.BindingActivity
import com.sopt.sopkathon8aos.util.extensions.setOnSingleClickListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostingActivity : BindingActivity<ActivityPostingBinding>(R.layout.activity_posting) {
    //    private val viewModel by viewModels<PostingViewModel>()
    private val postService = ServicePool.postService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getPost()
        addReview()

//        viewModel.getPost(0)
//        viewModel.successPosting.observe(this) { success ->
//            if (success) {
//                Toast.makeText(this, "getPost 성공 !", Toast.LENGTH_SHORT).show()
//                binding.tvPostingArticleTitle.text =
//                    viewModel.postingResult.value!!.data[0].postTitle
//                binding.tvPostingArticleContents.text =
//                    viewModel.postingResult.value!!.data[0].postContent
//            }
//        }
    }

    private fun addReview() {
        binding.btnPostingReviewBtn.setOnSingleClickListener {
            postService.addReview(
                RequestReviewDTO(
                    "빵주",
                    binding.etPostingReviewInput.text.toString(),
                    0,
                    "2022-10-22"
                )
            )
                .enqueue(object : Callback<ResponseReviewDTO> {
                    override fun onResponse(
                        call: Call<ResponseReviewDTO>,
                        response: Response<ResponseReviewDTO>
                    ) {
                        Log.d(
                            "SUCCESS",
                            "$response"
                        )
                        getPost()
                    }

                    override fun onFailure(call: Call<ResponseReviewDTO>, t: Throwable) {
                        Log.d(
                            "FAILURE",
                            "${t.message}"
                        )
                    }
                })
        }
    }

    private fun getPost() {
        postService.getPost(0).enqueue(object : Callback<ResponsePostDTO> {
            override fun onResponse(
                call: Call<ResponsePostDTO>,
                response: Response<ResponsePostDTO>
            ) {
                Log.d(
                    "GETPOST-SUCESS",
                    "예"
                )
                binding.tvPostingArticleTitle.text = response.body()!!.data[0].postTitle
                binding.tvPostingArticleContents.text = response.body()!!.data[0].postContent

                val adapter = PostAdapter(this@PostingActivity, response.body()!!.data[0].Comment)
                binding.rvPostingReviews.adapter = adapter
            }

            override fun onFailure(call: Call<ResponsePostDTO>, t: Throwable) {
                Log.d(
                    "GETPOST-RESPONSE/FAILURE",
                    t.message.toString()
                )
            }
        })
    }
}
