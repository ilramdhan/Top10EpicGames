package com.dicoding.top10epicgames

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailGameActivity : AppCompatActivity() {

    private lateinit var imgGame: ImageView
    private lateinit var tvGameName: TextView
    private lateinit var tvGameDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_game)

        imgGame = findViewById(R.id.img_game)
        tvGameName = findViewById(R.id.tv_game_name)
        tvGameDescription = findViewById(R.id.tv_game_description)

        // Menerima data game yang dikirim dari Intent
        val dataGame = intent.getParcelableExtra<Game>("key_game")

        // Periksa apakah dataGame tidak null
        if (dataGame != null) {
            val gameName = dataGame.name
            val gameDescription = dataGame.desc
            val gameImageResId = dataGame.photo

            // Set judul dan deskripsi game
            tvGameName.text = gameName
            tvGameDescription.text = gameDescription

            // Set gambar game
            imgGame.setImageResource(gameImageResId)
        }
    }
}
