package no.olav.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Getting Ids for elements in xml
        val buGetAge = findViewById<Button>(R.id.buGetAge)

        buGetAge.setOnClickListener {
            buttonGetAgeClick()
        }

    }


    private fun buttonGetAgeClick() {
        // Getting Ids for elements in xml
        val etDOB = findViewById<EditText>(R.id.etDOB)
        val tvShowAge = findViewById<TextView>(R.id.tvShowAge)

        val userDOB = Integer.parseInt(etDOB.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)

        val userAgeInYears = currentYear - userDOB

        tvShowAge.text = "Your Age is $userAgeInYears Years"

        // Using Logcat to show consolelogs
        Log.d("LogsMe", "Your Age is $userAgeInYears Years" )
    }



}