package com.thaariq.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.thaariq.newsapp.DataNews
import com.thaariq.newsapp.NewsAdapter
import com.thaariq.newsapp.R
import com.thaariq.newsapp.bindingNewsHeadline
import com.thaariq.newsapp.databinding.FragmentTopBinding


class TopFragment : Fragment() {

    private lateinit var binding : FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTopBinding.inflate(inflater, container, false)

        binding.rvTopNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.detailTopNews)
        }
        bindingNewsHeadline(binding.newsHeadline,2)
        return binding.root
    }

}