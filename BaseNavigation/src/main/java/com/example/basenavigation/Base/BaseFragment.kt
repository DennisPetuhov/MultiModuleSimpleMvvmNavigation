package com.example.basenavigation.Base

import androidx.fragment.app.Fragment

import androidx.navigation.fragment.findNavController


import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
open class BaseFragment : Fragment() {

    private fun handleNavigation(navCommand: NavigationCommand) {
        when (navCommand) {
            is NavigationCommand.ToDirection -> findNavController().navigate(navCommand.directions)
            is NavigationCommand.Back -> findNavController().navigateUp()
//            is NavigationCommand.Null-> null
            else -> throw Exception()
        }
    }

    fun observeNavigation(viewModel: BaseViewModel) {
        viewModel.navigation.observe(viewLifecycleOwner) {

            handleNavigation(it)

        }
    }

}