package com.example.data


import javax.inject.Inject

class Repository @Inject constructor() {

    val listofDog = listOf(
        Dog().toString(), Dog().toString()
    )


    val listOfCat = listOf(Cat().toString(), Cat().toString())
}