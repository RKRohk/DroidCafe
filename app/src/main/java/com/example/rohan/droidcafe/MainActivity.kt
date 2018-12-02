package com.example.rohan.droidcafe

import android.content.Intent
import android.os.Bundle
import android.provider.Contacts
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

val EXTRA_MESSAGE = "com.example.rohan.droidcafe.extra.MESSAGE"
lateinit var mOrderMessage:String
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            val intent = Intent(this,OrderActivity::class.java)
            intent.putExtra(EXTRA_MESSAGE, mOrderMessage)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
    fun displayToast(message:String){
        Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show()
    }
    fun showDonutOrder(view:View){
        displayToast(message = getString(R.string.donuts))
        mOrderMessage = getString(R.string.donut_order_message)
    }
    fun showIceCreamOrder(view: View){
        displayToast(message = getString(R.string.ice_cream_sandwiches))
        mOrderMessage = getString(R.string.ice_cream_order_message)
    }
    fun showFroyoOrder(view: View){
        displayToast(message = getString(R.string.froyo))
        mOrderMessage = getString(R.string.froyo_order_message)
    }
}
