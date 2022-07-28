package com.example.kase

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.kase.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {
    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

        binding.btnForward.setOnClickListener {
            val firstFragment = FirstFragment.newInstance()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, firstFragment)
                .addToBackStack(null)
                .commit()
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    companion object {
        fun newInstance() = SecondFragment()
    }
}