package com.example.assignment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var menu  = arrayListOf<String>("Hamburger", "Pizza","Mexican", "American", "Chinese");
    private lateinit var btnAddMenuItem: Button
    private lateinit var btnDecide: Button
    private lateinit var etNewMenuItem: EditText
    private lateinit var tvMeal: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initControls();
    }
    private fun initControls(){
        tvMeal = findViewById(R.id.tvMeal);
        etNewMenuItem = findViewById(R.id.etNewMenuItem)
        btnAddMenuItem = findViewById(R.id.btnAddMenuItem);
        btnDecide = findViewById(R.id.btnDecide);
    }

    fun addMenuItem(view: View){
        val item = etNewMenuItem.text.toString();
        menu.add(item);
        tvMeal.text = item;
        etNewMenuItem.clearComposingText();
    }

    fun decide(view: View){
        val idx = (Math.random() * menu.size).toInt();
        val choice = menu[idx];
        tvMeal.text = choice;
    }
}