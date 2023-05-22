package com.example.domain.UseCase




import com.example.data.Repository
import javax.inject.Inject

class DogUseCase @Inject constructor(val repository: Repository) {
    fun returnDog (): List<String> {
        return repository.listofDog

    }
}