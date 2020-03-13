package com.devproject.miguelfagundez.ndkromannumeralsexample.presenter

import com.devproject.miguelfagundez.ndkromannumeralsexample.InterfaceMVP
import com.devproject.miguelfagundez.ndkromannumeralsexample.model.ModelRoman

/************************************
 * Class name: PresenterRoman
 * Presenter class
 * @author Miguel Fagundez
 * @version 1.0
 * @since March 2020
 * ***********************************/
class PresenterRoman(var view : InterfaceMVP.View) : InterfaceMVP.Presenter {

    private lateinit var model : InterfaceMVP.Model

    init {
        model = ModelRoman(this)
    }

    // Giving data to the Model class
    override fun calculateRoman(number: Int) {
        model.giveDecimal(number)
    }

    // Sending data to the View
    override fun getRomanFromModel(roman: String) {
        view.printRomanResult(roman)
        view.showThisMessage("Successfully response")
    }

    // Connecting with the View
    override fun showErrorMessage(message: String) {
        view.showThisMessage(message)
    }
}