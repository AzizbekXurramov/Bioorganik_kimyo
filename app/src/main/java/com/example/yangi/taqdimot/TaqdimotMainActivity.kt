package com.example.yangi.taqdimot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yangi.Maruza.Maruzalar
import com.example.yangi.R
import com.example.yangi.adapter.PdfAdapter
import com.example.yangi.databinding.ActivityTaqdimotMainBinding
import com.example.yangi.model.PdfModel

class   TaqdimotMainActivity : AppCompatActivity(), PdfAdapter.SendData {
    private lateinit var _binding:ActivityTaqdimotMainBinding
    private val binding get() = _binding

    private var pdfAdapter = PdfAdapter()
    private var arrayList:ArrayList<PdfModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityTaqdimotMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData().clear()
        pdfAdapter.setVideos(loadData())
        binding.taqdimotList.layoutManager = LinearLayoutManager(this)
        binding.taqdimotList.adapter=pdfAdapter
        pdfAdapter.sendData = this





    }

    private fun loadData():ArrayList<PdfModel>{
        arrayList.add(PdfModel(0,"t1.pdf", R.drawable.taqdimot, "1-taqdimot"))
        arrayList.add(PdfModel(1,"t2.pdf", R.drawable.taqdimot, "2-taqdimot"))
        arrayList.add(PdfModel(2,"t3.pdf", R.drawable.taqdimot, "3-taqdimot"))
        arrayList.add(PdfModel(3,"t4.pdf", R.drawable.taqdimot, "4-taqdimot"))
        arrayList.add(PdfModel(4,"t5.pdf", R.drawable.taqdimot, "5-taqdimot"))
        arrayList.add(PdfModel(5,"t6.pdf", R.drawable.taqdimot, "6-taqdimot"))
        arrayList.add(PdfModel(6,"t7.pdf", R.drawable.taqdimot, "7-taqdimot"))
        arrayList.add(PdfModel(7,"t8.pdf", R.drawable.taqdimot, "8-taqdimot"))
        arrayList.add(PdfModel(8,"t9.pdf", R.drawable.taqdimot, "9-taqdimot"))
        arrayList.add(PdfModel(9,"t10.pdf", R.drawable.taqdimot, "10-taqdimot"))
        arrayList.add(PdfModel(10,"t11.pdf", R.drawable.taqdimot, "11-taqdimot"))
        arrayList.add(PdfModel(11,"t12.pdf", R.drawable.taqdimot, "12-taqdimot"))
        arrayList.add(PdfModel(12,"t13.pdf", R.drawable.taqdimot, "13-taqdimot"))
        arrayList.add(PdfModel(13,"t14.pdf", R.drawable.taqdimot, "14-taqdimot"))
        arrayList.add(PdfModel(14,"t15.pdf", R.drawable.taqdimot, "15-taqdimot"))

        return arrayList
    }

    override fun onSendClick(data: PdfModel) {
        val intent = Intent(this,Maruzalar::class.java)
        intent.putExtra("Pdf", data.pdf)
        startActivity(intent)
    }
}