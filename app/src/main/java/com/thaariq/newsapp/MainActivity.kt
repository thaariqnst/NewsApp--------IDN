package com.thaariq.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.thaariq.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.vpNews.adapter = SectionPagerAdapter(this)

        val tablist = arrayOf("All News", "Top News", "Popular")
        TabLayoutMediator(binding.tabs, binding.vpNews){
            tab, position -> tab.text = tablist[position]
        }.attach()
    }
}