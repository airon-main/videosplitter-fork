package io.github.videosplitterapp.screens.onesplit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class OneSplitViewModel : ViewModel() {

    val minValue = MutableLiveData<Float>()
    val maxValue = MutableLiveData<Float>()
    val selectedValues = MutableLiveData<List<Float>>()

    val enableSplit: LiveData<Boolean> = selectedValues.map { range ->
        (range[1] - range[0]) > 1
    }

    init {
        minValue.value = 0f
        maxValue.value = 1f
        selectedValues.value = arrayListOf(0f, 1f)
    }

    fun setMinMax(min: Long, max: Long) {
        minValue.value = min.toFloat()
        maxValue.value = max.toFloat()
        selectedValues.value = arrayListOf(min.toFloat(), max.toFloat())
    }

    fun setValues(values: MutableList<Float>) {
        selectedValues.value = values
    }
}