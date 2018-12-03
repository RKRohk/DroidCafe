package com.example.rohan.droidcafe

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.provider.MediaStore
import android.view.View
import android.widget.AbsListView
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {
    fun Context.toast(context: Context = applicationContext, message: Int, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(context, getString(message), duration).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        var intent = getIntent()
        var message = intent.getStringExtra(EXTRA_MESSAGE)
        order_textview.text = message
    }

    fun onRadioButtonClicked(view: View) {
        if (((view) as RadioButton).isChecked)
            when (view.id) {
                R.id.sameday -> toast(message = R.string.same_day_messenger_service)
                R.id.nextday -> toast(message = R.string.next_day_ground_delivery)
                R.id.pickup -> toast(message = R.string.pick_up)
            }
    }
}
