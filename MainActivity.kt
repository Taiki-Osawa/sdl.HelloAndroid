package jp.ac.titech.itpro.sdl.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var outputView: TextView? = null
    private var inputName: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        outputView = findViewById(R.id.output_view)
        inputName = findViewById(R.id.input_name)
    }

    fun greet(v: View?) {
        val name: String = inputName?.getText().toString().trim();
        if (name.length > 0) {
            outputView?.setText("Hello" + name + "\nNice to see you!")
        }
    }
}