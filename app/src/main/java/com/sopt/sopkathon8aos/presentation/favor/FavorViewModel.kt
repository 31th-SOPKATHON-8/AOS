package com.sopt.sopkathon8aos.presentation.favor

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
class FavorViewModel @Inject constructor(
    private val homeRepository: HomeRepository
) : ViewModel() {
    private val _favorResult = MutableLiveData<BrandEntity>()
    val favorResult: LiveData<BrandEntity> = _favorResult

    fun getBrand(index: Int) {
        Timber.d("getBrand 실행함")
        viewModelScope.launch {
            homeRepository.getBrand(index)
                .onSuccess { response ->
                    _favorResult.value = requireNotNull(response.data)
                }.onFailure { throwable ->
                    Timber.e(throwable.message)
                }
        }
    }
}
