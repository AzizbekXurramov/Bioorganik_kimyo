package com.example.yangi.labaratoriya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yangi.Maruza.Maruzalar
import com.example.yangi.R
import com.example.yangi.adapter.PdfAdapter
import com.example.yangi.databinding.ActivityLabaratoriyaBinding
import com.example.yangi.model.PdfModel

class Labaratoriya : AppCompatActivity(), PdfAdapter.SendData {
    private lateinit var _binding:ActivityLabaratoriyaBinding
    private val binding get() = _binding

    private var pdfAdapter = PdfAdapter()
    private var arrayList:ArrayList<PdfModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLabaratoriyaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadDatta().clear()
        pdfAdapter.setVideos(loadDatta())
        binding.labList.layoutManager = LinearLayoutManager(this)
        binding.labList.adapter = pdfAdapter
    pdfAdapter.sendData = this




    }

    private fun loadDatta():ArrayList<PdfModel>{
        arrayList.add(PdfModel(0,"L1.pdf", R.drawable.amaliy, "1-Labaratoriya"))
        arrayList.add(PdfModel(1,"L2.pdf", R.drawable.amaliy, "2-Labaratoriya"))
        arrayList.add(PdfModel(2,"L3.pdf", R.drawable.amaliy, "3-Labaratoriya"))
        arrayList.add(PdfModel(3,"L4.pdf", R.drawable.amaliy, "4-Labaratoriya"))
        arrayList.add(PdfModel(4,"L5.pdf", R.drawable.amaliy, "5-Labaratoriya"))
        arrayList.add(PdfModel(5,"L6.pdf", R.drawable.amaliy, "6-Labaratoriya"))
        arrayList.add(PdfModel(6,"L7.pdf", R.drawable.amaliy, "7-Labaratoriya"))
        arrayList.add(PdfModel(7,"L8.pdf", R.drawable.amaliy, "8-Labaratoriya"))
        arrayList.add(PdfModel(8,"L9.pdf", R.drawable.amaliy, "9-Labaratoriya"))
        arrayList.add(PdfModel(9,"L10.pdf", R.drawable.amaliy, "10-Labaratoriya"))
        arrayList.add(PdfModel(10,"L11.pdf", R.drawable.amaliy, "11-Labaratoriya"))
        arrayList.add(PdfModel(11,"L12.1.pdf", R.drawable.amaliy, "12-Labaratoriya"))
        arrayList.add(PdfModel(12,"L13.pdf", R.drawable.amaliy, "13-Labaratoriya"))
        arrayList.add(PdfModel(13,"L14.pdf", R.drawable.amaliy, "14-Labaratoriya"))
        arrayList.add(PdfModel(14,"L15.pdf", R.drawable.amaliy, "15-Labaratoriya"))
        arrayList.add(PdfModel(15,"L16.pdf", R.drawable.amaliy, "16-Labaratoriya"))
        arrayList.add(PdfModel(16,"L17.pdf", R.drawable.amaliy, "17-Labaratoriya"))
        arrayList.add(PdfModel(17,"L18.pdf", R.drawable.amaliy, "18-Labaratoriya"))
        arrayList.add(PdfModel(18,"L19.pdf", R.drawable.amaliy, "19-Labaratoriya"))
        arrayList.add(PdfModel(19,"L20.pdf", R.drawable.amaliy, "20-Labaratoriya"))
        arrayList.add(PdfModel(20,"L21.pdf", R.drawable.amaliy, "21-Labaratoriya"))
        arrayList.add(PdfModel(21,"L22.pdf", R.drawable.amaliy, "22-Labaratoriya"))
        arrayList.add(PdfModel(22,"L23.pdf", R.drawable.amaliy, "23-Labaratoriya"))
        arrayList.add(PdfModel(23,"L24.pdf", R.drawable.amaliy, "24-Labaratoriya"))
        arrayList.add(PdfModel(24,"L25.pdf", R.drawable.amaliy, "25-Labaratoriya"))
        arrayList.add(PdfModel(25,"L26.pdf", R.drawable.amaliy, "26-Labaratoriya"))
        arrayList.add(PdfModel(26,"L27.pdf", R.drawable.amaliy, "27-Labaratoriya"))
        arrayList.add(PdfModel(27,"L28.pdf", R.drawable.amaliy, "28-Labaratoriya"))
        arrayList.add(PdfModel(28,"L29.pdf", R.drawable.amaliy, "29-Labaratoriya"))
        arrayList.add(PdfModel(29,"L30.pdf", R.drawable.amaliy, "30-Labaratoriya"))

        return arrayList
    }

    override fun onSendClick(data: PdfModel) {
        val intent = Intent(this, Maruzalar::class.java)
        intent.putExtra("Pdf", data.pdf)
        startActivity(intent)
    }
}