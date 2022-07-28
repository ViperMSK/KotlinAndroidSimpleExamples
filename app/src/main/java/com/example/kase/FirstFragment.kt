package com.example.kase

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.kase.databinding.FragmentFirstBinding
import com.example.kase.navigation.navigator

class FirstFragment : Fragment(R.layout.fragment_first) {
    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)

        binding.btnForward.setOnClickListener {
            onForwardPressed(SecondFragment.newInstance())
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    private fun onForwardPressed(fragment: Fragment) {
        navigator().goToFragment(fragment)
    }
    private fun onBackPressed() {
        navigator().goBack()
    }

    companion object {
        fun newInstance() = FirstFragment()
    }
}