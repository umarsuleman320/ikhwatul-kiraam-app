package com.ikhwatulkiraam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DonationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donations)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Donations"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}