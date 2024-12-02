package com.zonedev.once

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zonedev.once.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding?.btnCatorce?.setOnClickListener{
            showCharacter("Catorce")
        }
        binding?.btnLorenzo?.setOnClickListener{
            showCharacter("Lorenzo")
        }
        binding?.btnDede?.setOnClickListener{
            showCharacter("Dede")
        }
        binding?.btnGabo?.setOnClickListener{
            showCharacter("Gabo")
        }
        binding?.btnRicky?.setOnClickListener{
            showCharacter("Ricky")
        }

    }
    fun showCharacter(name:String){
        var id = when(name){
            "Catorce" ->R.drawable.catorce
            "Lorenzo" ->R.drawable.lorenzo
            "Gabo" -> R.drawable.gabo_moreti
            "Dede" ->R.drawable.dede
            "Ricky" ->R.drawable.ricky
            else -> R.drawable.ic_launcher_background
        }
        binding?.imageView?.setImageResource(id)
    }
}