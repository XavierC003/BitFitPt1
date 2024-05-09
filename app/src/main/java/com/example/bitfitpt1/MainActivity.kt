package com.example.bitfitpt1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager: FragmentManager = supportFragmentManager

        // define your fragments here
        val foodListFragment: FoodListFragment = FoodListFragment.newInstance(application)



        // Set default selection

        val addNewFoodBtn = findViewById<Button>(R.id.addFoodBtn)
        addNewFoodBtn.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            this.startActivity(intent)
        }
    }
}