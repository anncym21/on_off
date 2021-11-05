package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.zadanie.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setCheckedChangedListener()

}
    private fun setCheckedChangedListener() {
        binding.toggleButtonID.setOnCheckedChangeListener { buttonView, isChecked ->
            val msg = "Toggle Button is " + if (isChecked) "ON" else "OFF"
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
            val toggle: ToggleButton = findViewById(R.id.red)
            val set_image = findViewById<ImageView>(R.id.czerwony)
            toggle.setOnClickListener(){
                if(isChecked){

                }else {

                }
                set_image.isVisible= true

            }
            val toggle1: ToggleButton = findViewById(R.id.blue)
            toggle.setOnClickListener(){
                if(isChecked){

                }else{

                }
            }
            val toggle2: ToggleButton = findViewById(R.id.green)
            toggle.setOnClickListener(){
                if(isChecked){

                }else{

                }
            }
        }
    }
}
