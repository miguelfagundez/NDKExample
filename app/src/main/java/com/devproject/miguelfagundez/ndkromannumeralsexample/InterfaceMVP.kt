package com.devproject.miguelfagundez.ndkromannumeralsexample

/************************************
 * Interface name: InterfaceMVP
 * Interface to construct the MVP architecture
 * @author Miguel Fagundez
 * @version 1.0
 * @since March 2020
 * ***********************************/
interface InterfaceMVP {

    interface View{
        fun changeDecimalToRoman(number: Int)
        fun printRomanResult(roman : String)
        fun showThisMessage(message : String)
    }
    interface Presenter{
        fun calculateRoman(number : Int)
        fun getRomanFromModel(roman : String)
        fun showErrorMessage(message : String)
    }
    interface Model{
        fun takeRoman(roman: String)
        fun giveDecimal(number : Int)
    }
}