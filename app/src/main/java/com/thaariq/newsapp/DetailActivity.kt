package com.thaariq.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thaariq.newsapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_IMAGE_HEADLINE = "image"
        const val EXTRA_TITLE_HEADLINE = "title"
        const val EXTRA_CONTENT_HEADLINE = "content"
        const val EXTRA_DATE_HEADLINE = "date"
        const val EXTRA_AUTHOR_HEADLINE = "author"
        const val NEWS_DATA = "data"
    }

    private lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "News"
        }

        //MENERIMA DATA DARI INTENT PARCEALBLE
        val news = intent.getParcelableExtra<News>(NEWS_DATA)

        val photoHeadline = intent.getIntExtra(EXTRA_IMAGE_HEADLINE,0)
        val titleHeadline = intent.getStringExtra(EXTRA_TITLE_HEADLINE)
        val contentHeadline = intent.getStringExtra(EXTRA_CONTENT_HEADLINE)
        val dateHeadline = intent.getStringExtra(EXTRA_DATE_HEADLINE)
        val authorHeadline = intent.getStringExtra(EXTRA_AUTHOR_HEADLINE)

        if (news != null){
            binding.imgNewsDetail.setImageResource(news.photo)
            binding.tvTitleDetail.text = news.title
            binding.tvContentDetail.text = news.content
            binding.tvDateDetail.text = news.date
            binding.tvAuthorDetail.text = news.author
        }else{
            binding.imgNewsDetail.setImageResource(photoHeadline)
            binding.tvTitleDetail.text = titleHeadline
            binding.tvContentDetail.text = contentHeadline
            binding.tvDateDetail.text = dateHeadline
            binding.tvAuthorDetail.text = authorHeadline

        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}