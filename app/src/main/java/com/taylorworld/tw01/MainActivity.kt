package com.taylorworld.tw01

import android.app.Activity
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

        //       fab.setOnClickListener { view ->
        //          Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //            .setAction("Action", null).show()
        //  }
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

    //var strength = Integer.parseInt(editText2.text.toString())
    //var dexterity = Integer.parseInt(editText.text.toString())
    //var intelligance = Integer.parseInt(editText4.text.toString())
    //var wisdom = Integer.parseInt(editText3.text.toString())
    //var constitution = Integer.parseInt(editText6.text.toString())
    //var charisma = Integer.parseInt(editText5.text.toString())
    //var chrname = editText7.text.toString()

    val sharedPref = this?.getPreferences(Context.MODE_PRIVATE)

    public fun saveStr(view: View) {
        var strength = Integer.parseInt(editText2.text.toString())
        // this should be getPreferences
        val sharedPref = this?.getPreferences(Context.MODE_PRIVATE) ?: return with(sharedPref.edit()) {
            putInt(getString(R.string.STR), strength)
            apply()
        }
    }

    public fun saveDex(view: View) {
        var dexterity = Integer.parseInt(editText.text.toString())
        // this should be getPreferences
        val sharedPref = this?.getPreferences(Context.MODE_PRIVATE) ?: return with(sharedPref.edit()) {
            putInt(getString(R.string.DEX), dexterity)
            apply()
        }
    }

    public fun saveInt(view: View) {
        var intelligance = Integer.parseInt(editText4.text.toString())
        // this should be getPreferences
        val sharedPref = this?.getPreferences(Context.MODE_PRIVATE) ?: return with(sharedPref.edit()) {
            putInt(getString(R.string.INT), intelligance)
            apply()
        }
    }

    public fun saveWis(view: View) {
        var wisdom = Integer.parseInt(editText3.text.toString())
        // this should be getPreferences
        val sharedPref = this?.getPreferences(Context.MODE_PRIVATE) ?: return with(sharedPref.edit()) {
            putInt(getString(R.string.WIS), wisdom)
            apply()
        }

    }

    public fun saveCha(view: View) {
        var charisma = Integer.parseInt(editText5.text.toString())
        // this should be getPreferences
        val sharedPref = this?.getPreferences(Context.MODE_PRIVATE) ?: return with(sharedPref.edit()) {
            putInt(getString(R.string.CHA), charisma)
            apply()
        }

    }

    public fun saveCon(view: View) {
        var constitution = Integer.parseInt(editText6.text.toString())
        // this should be getPreferences
        val sharedPref = this?.getPreferences(Context.MODE_PRIVATE) ?: return with(sharedPref.edit()) {
            putInt(getString(R.string.CON), constitution)
            apply()
        }

    }
    public fun saveChr(view: View) {
        var chrname = editText7.text.toString()
        // this should be getPreferences
        val sharedPref = this?.getPreferences(Context.MODE_PRIVATE) ?: return with(sharedPref.edit()) {
            putString(getString(R.string.CHR), chrname)
            apply()
        }
    }

}



