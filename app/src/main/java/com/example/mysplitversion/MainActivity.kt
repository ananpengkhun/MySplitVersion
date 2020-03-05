package com.example.mysplitversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : MyBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
