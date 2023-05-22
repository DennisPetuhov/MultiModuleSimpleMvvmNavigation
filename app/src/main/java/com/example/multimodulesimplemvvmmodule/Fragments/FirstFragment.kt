package com.example.multimodulesimplemvvmmodule.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.basenavigation.Base.BaseFragment

import com.example.multimodulesimplemvvmmodule.databinding.FragmentFirstBinding



class FirstFragment : BaseFragment() {


    companion object {
        fun newInstance() = FirstFragment()
    }

    val viewModel: FirstViewModel by viewModels()
    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        observeNavigation(viewModel)
        navigatetoSecond()
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        println(viewModel.catUseCase.repository.listOfCat)

    }

    fun navigatetoSecond() {
        val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
        binding.button2.setOnClickListener {
//            val navController = findNavController()
//            navController.navigate(action)
            viewModel.navigate(action)

        }
    }

}