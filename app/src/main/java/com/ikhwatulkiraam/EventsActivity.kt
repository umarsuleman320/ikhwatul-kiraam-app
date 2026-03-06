package com.ikhwatulkiraam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class EventsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Events & Announcements"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}