package ouap.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.my_item_id)

        //move of button
        val paramLayout = button.layoutParams as ConstraintLayout.LayoutParams
        paramLayout.bottomToTop= R.id.id_esiee
        button.requestLayout()

        // list of strings, sorted and print in the Logcat and a text view
        //val noums : List<String> = listOf("plane","technologies","cat","this","computer")
        val noums = listOf("plane","technologies","cat","this","computer")
        val noumsS= noums.sortedBy { it.length  }
        Log.d("Result",noumsS.toString())

        val resultprinter = findViewById<TextView>(R.id.result_printer)
        val paramLayout2 = resultprinter.layoutParams as ConstraintLayout.LayoutParams
        paramLayout2.bottomToTop= R.id.my_item_id
        resultprinter.requestLayout()
        resultprinter.text=noumsS.toString()



        button.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(v: View)
            {
                //Adding a E at the end of the textView
                val text = findViewById<TextView>(R.id.id_esiee)
                var str :String =text.text.toString() + "E"
                text.text = str

                //Change the text of the button (choose randomly in the list below)
                button.text=noumsS.shuffled()[0]
            }
        })

    }



    override fun onStop() {
        super.onStop()
        Log.i("State","onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.i("State","onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("State","onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.i("State","onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("State","onDestroy")
    }
}
