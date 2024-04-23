package com.example.hw_03_07

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.hw_03_07.databinding.ActivitySecondBinding

class SecondActivity : FragmentActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getStringExtra("key")
        binding.tvSecond.text = data
    }
}