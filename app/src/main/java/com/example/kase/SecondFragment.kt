package com.example.kase

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kase.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {
    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

        var message = ""
        arguments?.let {
            message = it.getString("args2").toString()
            binding.textView.text = "${binding.textView.text} + $message"
        }

        binding.btnForward.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment("From 2nd")
            findNavController().navigate(action)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}