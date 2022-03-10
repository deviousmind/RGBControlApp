package com.finepine.rgbcontrol

import androidx.appcompat.app.AppCompatActivity
import com.finepine.rgbcontrol.databinding.ActivityMainBinding
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.red.setOnClickListener {

        }

        binding.green.setOnClickListener {

        }

        binding.blue.setOnClickListener {

        }

        binding.power.setOnClickListener {

        }
    }
}