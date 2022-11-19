package com.sopt.sopkathon8aos.presentation.favor

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sopt.sopkathon8aos.data.entity.Post
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class FavorViewModel() : ViewModel() {
    private val _favorResult = MutableLiveData<List<Post>>()
    val favorResult: LiveData<List<Post>> = _favorResult
}
