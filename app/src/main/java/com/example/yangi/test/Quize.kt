package com.example.yangi.test

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.yangi.R
import com.example.yangi.databinding.ActivityQuizeBinding
import com.example.yangi.model.Constants
import com.example.yangi.model.Savollar
import com.example.yangi.test.Result

class Quize : AppCompatActivity(), View.OnClickListener {
    private lateinit var _binding:ActivityQuizeBinding
    private val binding get() = _binding

private var mhozirgiQator:Int=1
private var mSavollarList:ArrayList<Savollar>? = null
private var mSelectedOptionOPositon:Int=0
private var mTugriJavob:Int=0
private var mUserName:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityQuizeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mUserName = intent.getStringExtra(Constants.USER_NAME)


        mSavollarList = Constants.getSavollar()

        setSavollar()
        binding.variant1.setOnClickListener(this)
        binding.variant2.setOnClickListener(this)
        binding.variant3.setOnClickListener(this)
        binding.variant4.setOnClickListener(this)
        binding.submit.setOnClickListener(this)




    }

    @SuppressLint("SetTextI18n")
    private fun setSavollar() {
        // mhozirgiQator=1
        val savollar = mSavollarList!![mhozirgiQator-1]
        defaultoptionView()

        if (mhozirgiQator == mSavollarList!!.size){
            binding.submit.text="tugash"
        }else{
            binding.submit.text = "yuborish"
        }
        binding.progresbar.progress=mhozirgiQator
        binding.tvProgres.text="$mhozirgiQator"+"/"+binding.progresbar.max
        binding.savollar.text = savollar.savol
        binding.variant1.text=savollar.A
        binding.variant2.text=savollar.B
        binding.variant3.text=savollar.C
        binding.variant4.text=savollar.D

    }

    private fun defaultoptionView() {
        val  variantlar = ArrayList<TextView>()
        variantlar.add(0,binding.variant1)
        variantlar.add(1, binding.variant2)
        variantlar.add(2,binding.variant3)
        variantlar.add(3, binding.variant4)

        for (varinat in variantlar){
            varinat.setTextColor(Color.parseColor("#A69EB1"))
            varinat.typeface = Typeface.DEFAULT
            varinat.background = ContextCompat.getDrawable(this, R.drawable.buton_variant_bir)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.variant1 -> {
                selectedOptionView(binding.variant1, 1)
            }

            R.id.variant2 -> {
                selectedOptionView(binding.variant2,2)
            }
            R.id.variant3 -> {
                selectedOptionView(binding.variant3, 3)
            }
            R.id.variant4 -> {
                selectedOptionView(binding.variant4, 4)
            }
            R.id.submit -> {
                if (mSelectedOptionOPositon==0){
                    mhozirgiQator++

                    when{
                        mhozirgiQator <= mSavollarList!!.size ->{
                            setSavollar()
                        }else ->{
                        val intent = Intent(this, Result::class.java )
                        intent.putExtra(Constants.USER_NAME, mUserName)
                        intent.putExtra(Constants.TUGRI_JAVOBLAR, mTugriJavob )
                        intent.putExtra(Constants.JAMI_SAVOL, mSavollarList!!.size)
                        startActivity(intent)
                        finish()
                    }

                    }
                }else{

                    val savol = mSavollarList?.get(mhozirgiQator-1)
                    if (savol!!.tugri_javob != mSelectedOptionOPositon){
                        tugriView(mSelectedOptionOPositon, R.drawable.buton_variant_xato)
                    }else{
                        mTugriJavob++
                    }
                    tugriView(savol.tugri_javob, R.drawable.buton_variant_tugri)

                    if (mhozirgiQator == mSavollarList!!.size){
                        binding.submit.text="tugash"
                    }else{
                        binding.submit.text="Keyingi savolga o'tish"
                    }
                    mSelectedOptionOPositon=0
                }


            }
        }
    }

    private fun tugriView(tugri:Int, drawblView:Int) {
        when(tugri){
            1 -> {
                binding.variant1.background = ContextCompat.getDrawable(this, drawblView)
            }
            2 -> {
                binding.variant2.background = ContextCompat.getDrawable(this, drawblView)
            }
            3 -> {
                binding.variant3.background = ContextCompat.getDrawable(this, drawblView)
            }
            4 -> {
                binding.variant4.background = ContextCompat.getDrawable(this, drawblView)
            }
        }
    }

    private fun selectedOptionView(textView: TextView, selektedOptionNum:Int) {
        defaultoptionView()
        mSelectedOptionOPositon=selektedOptionNum
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background =ContextCompat.getDrawable(this, R.drawable.buton_variant_select)
    }
}