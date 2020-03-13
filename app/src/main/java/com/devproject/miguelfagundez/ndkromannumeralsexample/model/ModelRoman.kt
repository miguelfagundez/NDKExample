package com.devproject.miguelfagundez.ndkromannumeralsexample.model

import com.devproject.miguelfagundez.ndkromannumeralsexample.InterfaceMVP
import com.devproject.miguelfagundez.ndkromannumeralsexample.presenter.PresenterRoman

/************************************
 * Class name: ModelRoman
 * Model class
 * @author Miguel Fagundez
 * @version 1.0
 * @since March 2020
 * ***********************************/
class ModelRoman(var presenter : PresenterRoman) : InterfaceMVP.Model {

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun calculateRoman(number: Int): String

    // Sending result to the Presenter
    override fun takeRoman(roman : String) {
        presenter.getRomanFromModel(roman)
    }

    // Receiving data from the Presenter
    override fun giveDecimal(number : Int) {
        // *************************************
        // I call my C/C++ function here
        // *************************************
        var result = calculateRoman(number)

        //************************************
        // Return the result
        //************************************
        takeRoman(result)
    }
}