package com.example.basenavigation.Base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.basenavigation.Base.NavigationCommand

//@HiltViewModel
open class BaseViewModel  : ViewModel() {

    private val _navigation = MutableLiveData<NavigationCommand>()
    val navigation: LiveData<NavigationCommand> get() = _navigation
//    private val _navigation : MutableStateFlow<NavigationCommand> = MutableStateFlow(NavigationCommand.Null)
//    val navigation: StateFlow<NavigationCommand> get() = _navigation


    fun navigate(navDirections: NavDirections) {
        _navigation.value = NavigationCommand.ToDirection(navDirections)
    }

    fun navigateBack() {
        _navigation.value = NavigationCommand.Back
    }


}