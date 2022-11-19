package com.sopt.sopkathon8aos.presentation.brand

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopt.sopkathon8aos.data.entity.BrandEntity
import com.sopt.sopkathon8aos.data.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class BrandViewModel @Inject constructor(
    private val homeRepository: HomeRepository
) : ViewModel() {
    private val _brandResult = MutableLiveData<BrandEntity>()
    val brandResult: LiveData<BrandEntity> = _brandResult

    fun getBrand(index: Int) {
        viewModelScope.launch {
            homeRepository.getBrand(index)
                .onSuccess { response ->
                    _brandResult.value = requireNotNull(response.data)
                }.onFailure { throwable ->
                    Timber.e(throwable.message)
                }
        }
    }
}
