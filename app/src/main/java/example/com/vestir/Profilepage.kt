package example.com.vestir

import android.app.ActionBar
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_profilepage.*
import kotlinx.android.synthetic.main.activity_transaction.*
import kotlinx.android.synthetic.main.layout_toolbar.*
import kotlinx.android.synthetic.main.staffcardview.*

class Profilepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profilepage)




        img_back.setOnClickListener { onBackPressed() }



        fltbtn.setOnClickListener {


            val inflater :LayoutInflater= LayoutInflater.from(this)
            val view  = inflater.inflate(R.layout.staffcardview, llv)

            llv.addView(view)


        }


    }}







