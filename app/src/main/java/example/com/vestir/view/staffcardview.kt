package example.com.vestir.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import example.com.vestir.R
import kotlinx.android.synthetic.main.staffcardview.*

class staffcardview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.staffcardview)


        button1.setOnClickListener(){
            var inputValue: String = etname.text.toString()
            if (inputValue == null || inputValue.trim()==""){
                Toast.makeText(this,"Please input data", Toast.LENGTH_LONG).show()
            }else{
                etname.visibility= View.GONE
                tvname.visibility= View.VISIBLE
                tvname.setText(inputValue).toString()

            }


    }

    }
}




