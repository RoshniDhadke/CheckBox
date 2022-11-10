package com.example.togglebutton

import com.example.togglebutton.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cb1=findViewById<CheckBox>(R.id.cb1)
        var cb2=findViewById<CheckBox>(R.id.cb2)
        var cb3=findViewById<CheckBox>(R.id.cb3)
        var cb4=findViewById<CheckBox>(R.id.cb4)
        var btn=findViewById<Button>(R.id.btn)
        var tv2=findViewById<TextView>(R.id.tv2)
        btn.setOnClickListener {

            var starter=cb1.isChecked
            var maincourse=cb2.isChecked
            var dessert=cb3.isChecked
            var juice=cb4.isChecked
            var input= " "

            if(starter)
                input=input+"starter 200Rs\n"
            if(maincourse)
                input=input+"maincourse 500Rs\n"

            if(dessert)
                input=input+"dessert 100 Rs\n"

            if(juice)
                input=input+"juice 80Rs"

            Toast.makeText(this,"Selected items\n $input " ,Toast.LENGTH_LONG).show()
        }

    }
}