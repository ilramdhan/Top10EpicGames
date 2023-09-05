package com.dicoding.top10epicgames

import android.content.Intent
import android.os.Bundle
import android.view.View
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

    fun shareGame(view: View) {
        val gameName = findViewById<TextView>(R.id.tv_game_name).text.toString()
        val gameDescription = findViewById<TextView>(R.id.tv_game_description).text.toString()

        val shareText = "Check out this awesome game:\n\n$gameName\n\n$gameDescription"

        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_TEXT, shareText)
        sendIntent.type = "text/plain"

        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }

}
