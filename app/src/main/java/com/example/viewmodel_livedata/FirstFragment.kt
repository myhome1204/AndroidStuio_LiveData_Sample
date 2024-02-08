package com.example.viewmodel_livedata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel_livedata.databinding.FirstfragmentBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FirstfragmentBinding
    private lateinit var exampleViewModel : ExampleViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FirstfragmentBinding.inflate(inflater)
        exampleViewModel = ViewModelProvider(requireActivity()).get(ExampleViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btn.setOnClickListener {
            exampleViewModel.plusOne()
        }
    }
}