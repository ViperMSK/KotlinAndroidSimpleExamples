package com.example.kase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kase.adapter.TaskAdapter
import com.example.kase.data.Datasource
import com.example.kase.databinding.FragmentRVBinding

class RVFragment : Fragment(R.layout.fragment_r_v) {
    private lateinit var binding: FragmentRVBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRVBinding.bind(view)

        binding.recyclerView.adapter = TaskAdapter(Datasource.taskList)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
}