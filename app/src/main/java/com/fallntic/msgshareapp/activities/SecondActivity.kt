package com.fallntic.msgshareapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fallntic.msgshareapp.Constants.USER_MSG_KEY
import com.fallntic.msgshareapp.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val message = bundle!!.getString(USER_MSG_KEY)

        txvUserMessage.text = message
    }
}
