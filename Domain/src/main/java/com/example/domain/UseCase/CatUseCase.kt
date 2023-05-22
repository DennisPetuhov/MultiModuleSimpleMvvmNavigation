package com.example.domain.UseCase


import com.example.data.Repository
import javax.inject.Inject

class CatUseCase @Inject constructor(val repository: Repository) {
    fun returnCat(): List<String> {
        return repository.listOfCat

    }
}