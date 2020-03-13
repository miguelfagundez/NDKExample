package com.devproject.miguelfagundez.ndkromannumeralsexample.utils

import android.app.Activity
import android.widget.Toast

//**********************
// Extension function
//**********************
fun Activity.MyMessage(message : String, duration : Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, message, duration).show()
}