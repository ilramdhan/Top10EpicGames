package com.dicoding.top10epicgames

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Mengambil referensi TextView dari layout
        val tvDeveloperName = findViewById<TextView>(R.id.tv_developer_name)
        val tvDeveloperEmail = findViewById<TextView>(R.id.tv_developer_email)

        // Mengambil string dari strings.xml
        val developerName = getString(R.string.nama_anda)
        val developerEmail = getString(R.string.email_anda_com)

        // Mengatur string ke TextView
        tvDeveloperName.text = developerName
        tvDeveloperEmail.text = developerEmail
    }
}
