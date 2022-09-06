package com.example.article_1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.article_1.presentation.viewmodel.ShowTimeViewModel

class ShowTimeFragment : Fragment() {

    companion object {
        fun newInstance() = ShowTimeFragment()
    }

    private lateinit var viewModel: ShowTimeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_show_time, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ShowTimeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}