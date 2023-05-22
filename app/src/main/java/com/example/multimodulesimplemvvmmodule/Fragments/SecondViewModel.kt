package com.example.multimodulesimplemvvmmodule.Fragments

import com.example.domain.UseCase.DogUseCase
import com.example.basenavigation.Base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

import javax.inject.Inject

@HiltViewModel
class SecondViewModel @Inject constructor( val dogUseCase: DogUseCase) : BaseViewModel() {
    // TODO: Implement the ViewModel
}