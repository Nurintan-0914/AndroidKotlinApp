package nurintan.androidkotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.time.Instant

class MainActivity : AppCompatActivity() {
   private lateinit var tvCounter: TextView
   private lateinit var btnAddNumber: Button
   private lateinit var btnSubtractNumber: Button
   private lateinit var btnResetNumber: Button

   override fun onCreate(savedInstantState: Bundle?){
       super.onCreate(savedInstantState)
       setContentView(R.layout.activity_main)

       tvCounter = findViewById(R.id.tvCounter)
       btnAddNumber = findViewById(R.id.btnAddNumber)
       btnSubtractNumber = findViewById(R.id.btnSubtractNumber)
       btnResetNumber = findViewById(R.id.btnResetNumber)


       tvCounter.text = "1"
   }

    fun addNumber(v: View){
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        tvCounter.text = nextVal.toString()
    }

    fun subtractNumber(v: View) {
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal - 1
        tvCounter.text = nextVal.toString()
    }

    fun resetNumber(v: View) {
        tvCounter.text = "0"
    }

}