package com.example.yangi.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yangi.MainActivity
import com.example.yangi.R
import com.example.yangi.databinding.ActivityResultBinding
import com.example.yangi.model.Constants

class Result : AppCompatActivity() {
    private lateinit var _binding:ActivityResultBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username =intent.getStringExtra(Constants.USER_NAME)
        binding.tvName.text=username

        val jamisavol = intent.getIntExtra(Constants.JAMI_SAVOL,0)
        val tugri_javob = intent.getIntExtra(Constants.TUGRI_JAVOBLAR,0)

        binding.tvScore.text ="Jami $jamisavol ta savoldan $tugri_javob tasi tug'ri"

        binding.btFinish.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}