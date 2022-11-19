package com.sopt.sopkathon8aos.presentation.posting

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sopt.sopkathon8aos.data.ResponsePostDTO
import com.sopt.sopkathon8aos.data.ServicePool.postService
import retrofit2.*

class PostingViewModel : ViewModel() {
    private val _postingResult: MutableLiveData<ResponsePostDTO> = MutableLiveData()
    val postingResult: LiveData<ResponsePostDTO> = _postingResult

    private val _successPosting = MutableLiveData<Boolean>()
    val successPosting: LiveData<Boolean> = _successPosting

    fun getPost(postId: Int) {
        postService.getPost(postId).enqueue(object : Callback<ResponsePostDTO> {
            override fun onResponse(
                call: Call<ResponsePostDTO>,
                response: Response<ResponsePostDTO>
            ) {
                if (response.code() == 200) {
                    _successPosting.value = true
                    _postingResult.value = response.body()
                } else {
                    _successPosting.value = false
                }
            }
            override fun onFailure(call: Call<ResponsePostDTO>, t: Throwable) {
                Log.d("TEST", "$t")
            }
        })
    }
}
