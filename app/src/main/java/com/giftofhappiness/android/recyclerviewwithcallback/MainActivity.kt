package com.giftofhappiness.android.recyclerviewwithcallback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.giftofhappiness.android.recyclerviewwithcallback.databinding.ActivityMainBinding

    lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)



        setContentView(binding.root)


        var partList = ArrayList<PartData>()

        partList.add(PartData(100411, "LED Green 568 nm, 5mm"))
        partList.add(PartData(101119, "Aluminum Capacitor 4.7 uF"))
        partList.add(PartData(101624, "Potentiometer 500kohms"))











    }
}