package com.fallntic.msgshareapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.fallntic.msgshareapp.Constants
import com.fallntic.msgshareapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Toast message", Toast.LENGTH_SHORT).show()
        })

        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra(Constants.USER_MSG_KEY, message)

            startActivity(intent)
        }

        btnShareToOtherApps.setOnClickListener{
            val message: String = etUserMessage.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to: "))
        }
    }
}
