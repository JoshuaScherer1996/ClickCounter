package com.datphoenixstudios.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Getting access to my button and saving it in a variable
        //Also declaring variables to access our text and to count our clicks
        val clickMeBtn = findViewById<Button>(R.id.clickBtn)
        val clickText = findViewById<TextView>(R.id.countingText)
        var timesClicked = 0

        //Setting an on click listener to our button
        clickMeBtn.setOnClickListener {
            //increasing our times clicked and setting our textView to our to string converted number
            timesClicked++
            clickText.text = timesClicked.toString()

            //Makes a pop up everytime we click the button
            Toast.makeText(this, "You clicked the button!", Toast.LENGTH_SHORT).show()
        }
    }
}