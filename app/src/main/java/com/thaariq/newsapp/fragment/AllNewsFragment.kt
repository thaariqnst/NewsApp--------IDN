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
import com.thaariq.newsapp.databinding.FragmentAllNewsBinding


class AllNewsFragment : Fragment() {

    private lateinit var binding : FragmentAllNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllNewsBinding.inflate(inflater, container, false)

        binding.rvAllNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.detailAllNews)
        }
        bindingNewsHeadline(binding.newsHeadline,0)
        return binding.root
    }

}