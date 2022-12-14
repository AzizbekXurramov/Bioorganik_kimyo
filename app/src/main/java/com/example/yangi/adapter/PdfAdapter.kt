package com.example.yangi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.yangi.R
import com.example.yangi.databinding.PdfItemBinding
import com.example.yangi.model.PdfModel

class PdfAdapter: RecyclerView.Adapter<PdfAdapter.ViewHolder>() {
lateinit var binding: PdfItemBinding

   var sendData:SendData?=null
var data:ArrayList<PdfModel> = ArrayList()


    fun setVideos(tuplam:ArrayList<PdfModel>){
        data.addAll(tuplam)
        notifyDataSetChanged()
    }


inner class ViewHolder(var binding: PdfItemBinding):RecyclerView.ViewHolder(binding.root){
    fun bindData(data:PdfModel){
        animateView(binding.root)
        binding.root.setOnClickListener {
            data.let { it -> sendData?.onSendClick(it) }
        }
        binding.rasm.setImageResource(data.image)
        binding.text.text=data.text


    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = PdfItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        data[position].let {
            holder.bindData(it)
        }
    }

    override fun getItemCount(): Int {
        return data.count()
    }

    private fun animateView(v: View) {
        if (v.animation == null)
            v.animation = AnimationUtils.loadAnimation(v.context, R.anim.scale_xy)
    }


        interface SendData{
        fun onSendClick(data: PdfModel)
    }
}