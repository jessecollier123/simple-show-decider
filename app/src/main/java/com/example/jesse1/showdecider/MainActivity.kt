package com.example.jesse1.showdecider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val showList = arrayListOf("Shameless", "The 100", "AGT", "The Bachelor", "Master Chef")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomShow = random.nextInt(showList.count())
            showTxt.text = showList[randomShow]
        }

        addShowBtn.setOnClickListener {
            val newShow = addShowTxt.text.toString()
            if (!addShowTxt.text.isEmpty()) {
                showList.add(newShow)
            }
            addShowTxt.text.clear()
        }

    }

}
