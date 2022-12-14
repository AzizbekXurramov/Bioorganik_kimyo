package com.example.yangi
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.yangi.Maruza.MaruzaList
import com.example.yangi.Maruza.Maruzalar
import com.example.yangi.databinding.ActivityMainBinding
import com.example.yangi.labaratoriya.Labaratoriya
import com.example.yangi.taqdimot.TaqdimotMainActivity
import com.example.yangi.test.TestMainActivity
import com.example.yangi.video.VideoMainActivity
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var _binding: ActivityMainBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("azizbek","hammaga salom")

        binding.navMenyu.setNavigationItemSelectedListener(this)

        binding.menyu.setOnClickListener {
            binding.draver.openDrawer(GravityCompat.START)
        }

        binding.slabus.setOnClickListener {
            val intent = Intent(this,Maruzalar::class.java)
            intent.putExtra("Pdf","slabus.pdf")
            startActivity(intent)
        }

        binding.maruza.setOnClickListener {
            val intent = Intent(this, MaruzaList::class.java)
            startActivity(intent)
        }

        binding.taqdimot.setOnClickListener {
            val intent = Intent(this, TaqdimotMainActivity::class.java)
            startActivity(intent)
        }

        binding.amaliy.setOnClickListener {
            val intent = Intent(this, Labaratoriya::class.java)
            startActivity(intent)
        }

        binding.video.setOnClickListener {
            val connMgr = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = connMgr.activeNetworkInfo
            if (networkInfo != null && networkInfo.isConnected) {
                val intent = Intent(this, VideoMainActivity::class.java)
                startActivity(intent)
            } else {
                val builder = AlertDialog.Builder(this)
                builder.setIcon(R.drawable.ic_baseline_wifi_off_24)
                builder.setTitle("Internet yo'q?")
                builder.setMessage("Mobil qurilmangizdan internet aloqasini tekshirib ko'ring!")
                builder.setPositiveButton(android.R.string.ok) { dialog,
                                                                 which ->
                }
                builder.show()

            }




        }
        binding.test.setOnClickListener {
            val intent = Intent(this, TestMainActivity::class.java)
            startActivity(intent)
        }
    }



        @SuppressLint("QueryPermissionsNeeded")
        private fun openUrlIntent(url: String) {
            val kelish = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW, kelish)
            if (intent.resolveActivity(packageManager) != null)
                startActivity(intent);

        }


        override fun onNavigationItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.bir -> {
                    val intent = Intent(this, Maruzalar::class.java)
                    intent.putExtra("Pdf", "muallif.pdf")
                    startActivity(intent)

                }

                R.id.ikinchi -> {
                    val intent = Intent(this, Maruzalar::class.java)
                    intent.putExtra("Pdf", "anatatsiya.pdf")
                    startActivity(intent)

                }
                R.id.telegram -> {
                    val connMgr =
                        this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
                    val networkInfo = connMgr.activeNetworkInfo
                    if (networkInfo != null && networkInfo.isConnected) {
                        openUrlIntent("https://t.me/+8AEJNhGSNhUwMmJi")
                    } else {
                        val builder = AlertDialog.Builder(this)
                        builder.setIcon(R.drawable.ic_baseline_wifi_off_24)
                        builder.setTitle("Internet yo'q?")
                        builder.setMessage("Mobil qurilmangizdan internet aloqasini tekshirib ko'ring!")
                        builder.setPositiveButton(android.R.string.ok) { dialog,
                                                                         which ->
                        }
                        builder.show()
                    }


                }

                R.id.chiqish ->{
                    this.finish()
                }

            }
            binding.draver.closeDrawer(GravityCompat.START)
            return true
        }
    }
