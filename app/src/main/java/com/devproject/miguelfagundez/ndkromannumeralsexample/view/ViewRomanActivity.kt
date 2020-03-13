package com.devproject.miguelfagundez.ndkromannumeralsexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devproject.miguelfagundez.ndkromannumeralsexample.InterfaceMVP
import com.devproject.miguelfagundez.ndkromannumeralsexample.R
import com.devproject.miguelfagundez.ndkromannumeralsexample.presenter.PresenterRoman
import com.devproject.miguelfagundez.ndkromannumeralsexample.utils.MyMessage
import kotlinx.android.synthetic.main.activity_main.*

/************************************
* Class name: ViewRomanActivity
* Base view class
* @author Miguel Fagundez
* @version 1.0
* @since March 2020
* ***********************************/
class ViewRomanActivity : AppCompatActivity(), InterfaceMVP.View {

    private lateinit var presenter : InterfaceMVP.Presenter

    init {
        presenter = PresenterRoman(this)
    }

    companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //*********************************
        // Button pressed - Execute
        //*********************************
        btnCalculate.setOnClickListener {
            changeDecimalToRoman(etDataEntry.text.toString().toInt())
        }

    }

    // Connecting with the Presenter
    override fun changeDecimalToRoman(number : Int) {
        presenter.calculateRoman(number)
    }

    // Printing result from Presenter
    override fun printRomanResult(roman: String) {
        tvPrintRomanResult.setText(roman)
    }

    // Util method
    override fun showThisMessage(message: String) {
        MyMessage(message)
    }
}
