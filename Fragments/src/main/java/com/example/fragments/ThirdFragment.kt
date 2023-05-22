package com.example.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels

import com.example.basenavigation.Base.BaseFragment
import com.example.fragments.databinding.FragmentThirdBinding


class ThirdFragment : BaseFragment() {

    companion object {
        fun newInstance() = ThirdFragment()
    }
    lateinit var binding: FragmentThirdBinding

    val viewModel: ThirdViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentThirdBinding.inflate(inflater, container, false)
        observeNavigation(viewModel)
        navigateTo()


        return binding.root
    }

    private fun navigateTo() {
        binding.button.setOnClickListener {
            val action = ThirdFragmentDirections.thirdFragmentToSecondFragment()
            viewModel.navigate(action)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: Use the ViewModel
    }

}