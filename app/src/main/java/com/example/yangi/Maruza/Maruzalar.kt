package com.example.yangi.Maruza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yangi.databinding.ActivityMaruzalarBinding

class Maruzalar : AppCompatActivity() {
    private lateinit var _binding: ActivityMaruzalarBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMaruzalarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.pdf.fromAsset("mavzu_1_hujayra_va_genomlar.pdf").load()
        val name=intent?.getStringExtra("Pdf")
        if (name != null){
        binding.pdf.fromAsset(name).load()
        }
    }
}