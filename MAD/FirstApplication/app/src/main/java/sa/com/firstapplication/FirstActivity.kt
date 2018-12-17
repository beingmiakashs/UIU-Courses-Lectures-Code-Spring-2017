package sa.com.firstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.button) as Button?
        button!!.setOnClickListener { Toast.makeText(this@FirstActivity, "Hello", Toast.LENGTH_LONG).show() }


    }
}
