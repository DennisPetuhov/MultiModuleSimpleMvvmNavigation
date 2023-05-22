package com.example.multimodulesimplemvvmmodule.Fragments

import com.example.domain.UseCase.CatUseCase
import com.example.basenavigation.Base.BaseViewModel


import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(var catUseCase: CatUseCase) : com.example.basenavigation.Base.BaseViewModel() {


}