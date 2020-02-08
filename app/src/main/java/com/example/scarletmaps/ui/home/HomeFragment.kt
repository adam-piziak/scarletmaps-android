package com.example.scarletmaps.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import com.example.scarletmaps.R
import com.example.scarletmaps.ScarletMapsApplication
import kotlinx.android.synthetic.main.home_fragment.*
import kotlinx.android.synthetic.main.home_fragment.view.*
import javax.inject.Inject

class HomeFragment : Fragment() {
    @Inject
    lateinit var homeViewModelFactory: HomeViewModelFactory
    val viewModel: HomeViewModel by viewModels { homeViewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.home_fragment, container, false)
        (context?.applicationContext as ScarletMapsApplication).appComponent.inject(this)

        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.name.observe(viewLifecycleOwner, Observer {
            titleView.text = viewModel.name.value
        })
    }
}