package com.example.rohan.droidcafe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        var intent = getIntent()
        var message = intent.getStringExtra(EXTRA_MESSAGE)
        order_textview.text = message
    }
}
