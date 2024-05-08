package com.example.myapplication2.ui.championship

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChampionshipViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is championship Fragment"
    }
    val text: LiveData<String> = _text
}