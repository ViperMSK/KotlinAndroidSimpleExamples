package com.example.kase

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kase.databinding.FragmentFirstBinding

/**
 * classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.5.1"
 * id 'androidx.navigation.safeargs.kotlin'
 * android:id="@+id/NavHostFragment"
 * android:name="androidx.navigation.fragment.NavHostFragment"
 * app:defaultNavHost="true"
 * app:navGraph="@navigation/nav_graph"
 */

class FirstFragment : Fragment(R.layout.fragment_first) {
    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)

        var message: String? = ""
        arguments?.let {
            message = it.getString("args1")
            if (message != null) {
                binding.textView.text = "${binding.textView.text} + $message"
            }
        }

        binding.btnForward.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("From 1st")
            findNavController().navigate(action)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}