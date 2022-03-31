package scipytoViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class scipytoViewModel: ViewModel() {
    private val _ChartName = MutableLiveData<String>()
    val ChartName: LiveData<String>
        get() = _ChartName


    private val _USD = MutableLiveData<Int>()
    val USD: LiveData<Int>
        get() = _USD


    private val _GBP = MutableLiveData<Int>()
    val GBP: LiveData<Int>
        get() = _GBP

    private val _EUR = MutableLiveData<Int>()
    val EUR: LiveData<Int>
        get() = _EUR

    private fun getNameData(): String? {
        return _ChartName.value
    }

    private fun getUsd(): Int? {
        return _USD.value
    }

    private fun getGbp():Int?{
        return _GBP.value
}
    private fun getEur():Int?{
        return _EUR.value
    }



}