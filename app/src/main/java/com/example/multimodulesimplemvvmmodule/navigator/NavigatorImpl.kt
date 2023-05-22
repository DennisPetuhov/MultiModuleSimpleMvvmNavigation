package com.example.multimodulesimplemvvmmodule.navigator

import androidx.navigation.NavController
import com.example.multimodulesimplemvvmmodule.Fragments.FirstFragmentDirections
import com.example.multimodulesimplemvvmmodule.Fragments.SecondFragmentDirections

class NavigatorImpl(val  navController: NavController):Navigator {
    override fun navigateToFirst() {
        val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            navController.navigate(action)

    }

    override fun navigateToSecond() {
        val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            navController.navigate(action)

    }
}