package com.example.kase

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.kase.databinding.FragmentSecondBinding
import com.example.kase.navigation.navigator

class SecondFragment : Fragment(R.layout.fragment_second) {
    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

        binding.btnForward.setOnClickListener {
            onForwardPressed(FirstFragment.newInstance())
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
        fun newInstance() = SecondFragment()
    }


}