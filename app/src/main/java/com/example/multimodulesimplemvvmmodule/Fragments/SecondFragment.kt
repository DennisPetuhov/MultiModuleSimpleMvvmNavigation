package com.example.multimodulesimplemvvmmodule.Fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.basenavigation.Base.BaseFragment


import com.example.multimodulesimplemvvmmodule.databinding.FragmentSecondBinding


class SecondFragment : BaseFragment() {

    companion object {
        fun newInstance() = SecondFragment()
    }

    lateinit var binding: FragmentSecondBinding

    val viewModel: SecondViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        observeNavigation(viewModel)
        navigatetoFirst()
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.dogUseCase.repository.listofDog
        // TODO: Use the ViewModel
    }

    fun navigatetoFirst() {
        val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
        binding.button.setOnClickListener {
//            val navController= findNavController()
//            navController.navigate(action)
            viewModel.navigate(action)
        }
        binding.button3.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment()
            viewModel.navigate(action)
        }
    }
}