package com.example.yangi.video

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yangi.R
import com.example.yangi.adapter.PdfAdapter
import com.example.yangi.databinding.ActivityVideoMainBinding
import com.example.yangi.model.PdfModel

class VideoMainActivity : AppCompatActivity(), PdfAdapter.SendData {
    private lateinit var _binding:ActivityVideoMainBinding
    private val binding get() = _binding

    private var pdfAdapter = PdfAdapter()
    private var arrayList:ArrayList<PdfModel> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding= ActivityVideoMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData().clear()
        pdfAdapter.setVideos(loadData())
        binding.videoList.layoutManager = LinearLayoutManager(this)
        binding.videoList.adapter = pdfAdapter
        pdfAdapter.sendData=this



    }

    private fun loadData():ArrayList<PdfModel>{
        arrayList.add(PdfModel(0,"OEuA7cMvaPY", R.drawable.video, "Oqsil tuzilishi va funksiyasi"))
        arrayList.add(PdfModel(1,"ZP9cRpDz0Ws", R.drawable.video, "Protien tuzilishi"))
        arrayList.add(PdfModel(2,"V4pluVWpVe0", R.drawable.video, "Protein tuzilishi Oqsil molekulasining tashkiliy darajalari"))

        return arrayList

    }

    override fun onSendClick(data: PdfModel) {
        val intent = Intent(this, VideoPlayer::class.java)
        intent.putExtra("Pdf", data.pdf)
        startActivity(intent)
    }
}