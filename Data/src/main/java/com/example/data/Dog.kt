package com.example.data

import javax.inject.Inject

class Dog @Inject constructor() {
    override fun toString(): String {
        return "Bjork"
    }
}