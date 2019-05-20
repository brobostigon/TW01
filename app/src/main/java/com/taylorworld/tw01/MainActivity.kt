package com.taylorworld.tw01

import android.content.Context
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(findViewById(R.id.my_toolbar))

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
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

    var strength = editText2.text.toString()
    var dexterity = editText.text.toString()
    var intelligance = editText4.text.toString()
    var wisdom = editText3.text.toString()
    var constitution = editText6.text.toString()
    var charisma = editText5.text.toString()
    var chrname = editText7.text.toString()

    val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)

     public fun saveStr(view: View) {

        val sharedPref = activity?.setPreferences(Context.MODE_PRIVATE) ?: return with (sharedPref.edit()) {
            putInt(getString(STR), strength)
            commit()
        }
    }
    public fun saveDex(view: View) {

        val sharedPref = activity?.setPreferences(Context.MODE_PRIVATE) ?: return with (sharedPref.edit()) {
            putInt(getString(DEX), dexterity)
            commit()
        }
    }

    public fun readStr(view: View) {

    }
}



