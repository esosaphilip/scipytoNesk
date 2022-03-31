package com.example.scipytonesk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.example.scipytonesk.databinding.ActivityMainBinding
import scipytoViewModel.scipytoViewModel



private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val model : scipytoViewModel by viewModels()

        model.getNameData().observe(this, Observer<List<User>>{ users ->

        })

    }
}