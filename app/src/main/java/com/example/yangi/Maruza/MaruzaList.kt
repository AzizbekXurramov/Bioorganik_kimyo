package com.example.yangi.Maruza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yangi.R
import com.example.yangi.adapter.PdfAdapter
import com.example.yangi.databinding.ActivityMaruzaListBinding
import com.example.yangi.model.PdfModel

class MaruzaList : AppCompatActivity(), PdfAdapter.SendData {
    private lateinit var _binding:ActivityMaruzaListBinding
    private val binding get() = _binding
    private var pdfAdapter = PdfAdapter()
    private var arrayList:ArrayList<PdfModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMaruzaListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData().clear()
        pdfAdapter.setVideos(loadData())
        binding.vidolist.layoutManager=LinearLayoutManager(this)
        binding.vidolist.adapter=pdfAdapter
        pdfAdapter.sendData=this

    }

    private fun loadData():ArrayList<PdfModel>{
        arrayList.add(PdfModel(0,"mavzu_1_hujayra_va_genomlar.pdf",R.drawable.maruza, "Hujayra va genomlar"))
        arrayList.add(PdfModel(1,"M2.pdf",R.drawable.maruza, "Aminokislotalar, kimyoviy xossalari va stereokimyosi"))
        arrayList.add(PdfModel(2,"M3.pdf",R.drawable.maruza, "Oqsillar va peptidlarning biologik funksiyasi"))
        arrayList.add(PdfModel(3,"M4.pdf",R.drawable.maruza, "Peptidlarning biologik vazifalari"))
        arrayList.add(PdfModel(4,"M5.pdf",R.drawable.maruza, "Oqsillarning birlamchi tuzilishini aniqlash."))
        arrayList.add(PdfModel(5,"M6.pdf",R.drawable.maruza, "Peptidlarning kimyoviy sintezi"))
        arrayList.add(PdfModel(6,"M7.pdf",R.drawable.maruza, "DNK va RNKning tuzilishi va funksiyasi"))
        arrayList.add(PdfModel(7,"M8.pdf",R.drawable.maruza, "Nuklein kislotalarning tuzilishini aniqlash uslublari"))
        arrayList.add(PdfModel(8,"M9.pdf",R.drawable.maruza, "DNK- va RNK ligazalar"))
        arrayList.add(PdfModel(9,"M10.pdf",R.drawable.maruza, "Nuklein kislotalarning fazoviy tuzilishlari"))
        arrayList.add(PdfModel(10,"M11.pdf",R.drawable.maruza, "Nuklein kislotalar biosintezi"))
        arrayList.add(PdfModel(11,"M12.pdf",R.drawable.maruza, "Replikatsiya, transkripsiya va translyatsiya"))
        arrayList.add(PdfModel(12,"M13.pdf",R.drawable.maruza, "Uglevodlarning nomenklaturasi"))
        arrayList.add(PdfModel(13,"M14.pdf",R.drawable.maruza, "Oligosaxaridlar"))
        arrayList.add(PdfModel(14,"M15.pdf",R.drawable.maruza, "Polisaxaridlar, ta’rifi va nomenklaturasi"))
        return arrayList

    }

    override fun onSendClick(data: PdfModel) {
        val intent = Intent(this, Maruzalar::class.java)
        intent.putExtra("Pdf", data.pdf)
        startActivity(intent)

    }
}