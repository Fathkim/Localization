package com.fathan.localization_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.fathan.localization_lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var _binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        _binding.KlikHere.setOnClickListener{
            //Membuat Intent
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        Log.i("Activity", "onCreate invoked")
        //Membuat Toast
        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT).show()

    }

    override fun onStart() {
        super.onStart()
        Log.i("Activity", "onStart invoked")
        Toast.makeText(applicationContext, "onStart", Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity", "onResume invoked")
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity", "onPause invoked")
        Toast.makeText(applicationContext, "onPause", Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity", "onStop invoked")
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity", "onDestroy invoked")
        Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_SHORT).show()

    }
}
