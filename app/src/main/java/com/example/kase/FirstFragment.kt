package com.example.kase

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.kase.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)

        binding.btnForward.setOnClickListener {
            val secondFragment = SecondFragment.newInstance()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, secondFragment)
                .addToBackStack(null)
                .commit()
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    companion object {
        fun newInstance() = FirstFragment()
    }
}