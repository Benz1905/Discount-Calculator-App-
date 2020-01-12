package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val oripirce = findViewById<EditText>(R.id.oripirce)
        val percentoff = findViewById<EditText>(R.id.percentoff)
        val outputTx = findViewById<TextView>(R.id.outputTx)
        val CalCulateBtn = findViewById<Button>(R.id.CalCulateBtn)
        val tax = findViewById<CheckBox>(R.id.tax)
        CalCulateBtn.setOnClickListener() {

            var originalpirce: Float = oripirce.text.toString().toFloat()
            var percentOff: Float = percentoff.text.toString().toFloat()
            var resultofpercent = (originalpirce * percentOff) / 100
            var resultprice: Float = 0F
             resultprice = originalpirce - resultofpercent


            if (tax.isChecked) {
             resultprice += (resultprice / 100 )*7
            }
            outputTx.setText(resultprice.toString())
        }

    }
}
