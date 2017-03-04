package com.borjabravo.simpleratingbarsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.borjabravo.simpleratingbar.SimpleRatingBar
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnChangeIndicator = findViewById(R.id.btn_change_indicator) as Button
        val btnChangeRating = findViewById(R.id.btn_change_rating) as Button
        val btnChangeRatingMargin = findViewById(R.id.btn_change_rating_margin) as Button
        val simpleRatingBar = findViewById(R.id.simple_rating_bar) as SimpleRatingBar

        btnChangeIndicator.setOnClickListener({ simpleRatingBar.isIndicator = !simpleRatingBar.isIndicator })
        btnChangeRating.setOnClickListener({
            val random = Random()
            val rating = random.nextFloat() * 6f
            simpleRatingBar.rating = rating
        })
        btnChangeRatingMargin.setOnClickListener({
            val random = Random()
            val ratingMargin = random.nextInt(80) + 5
            simpleRatingBar.ratingMargin = ratingMargin
        })
    }
}
