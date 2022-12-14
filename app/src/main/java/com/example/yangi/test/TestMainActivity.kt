package com.example.yangi.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.yangi.R
import com.example.yangi.databinding.ActivityTestMainBinding
import com.example.yangi.model.Constants

class TestMainActivity : AppCompatActivity() {
    private lateinit var _binding:ActivityTestMainBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityTestMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnstart.setOnClickListener {
            if (binding.edittext.text.toString().isEmpty()){
                Toast.makeText(this,"Iltimos isminggizni kiriting!", Toast.LENGTH_SHORT).show()

            }else{
                val intent = Intent(this, Quize::class.java)
                intent.putExtra(Constants.USER_NAME, binding.edittext.text.toString())
                startActivity(intent)
                finish()
            }
        }


    }
}