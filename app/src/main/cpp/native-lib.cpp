#include <jni.h>
#include <string>
#include <iostream>

extern "C" JNIEXPORT jstring JNICALL
//*************************************************************
// package_name_internal_directory_name_class_name_method_name
//*************************************************************
Java_com_devproject_miguelfagundez_ndkromannumeralsexample_model_ModelRoman_calculateRoman(
        JNIEnv* env,
        jobject,
        jint number) {

    std::string result = "Range should be between 1 to 3000.";
    //**************************
    // Basic validation 1-3000
    //**************************
    if(number > 0 && number < 3001){
        result = "";
        //**********************
        // Convertion Process
        // Any C/C++ code here
        //**********************
        if(number==3000) {result += "MMM"; number=0;}
        if(number>=2000) {result +="M";number-=1000;}
        if(number>=1000) {result +="M";number-=1000;}
        if(number>=900)  {result +="CM";number-=900;}
        if(number>=500)  {result +="D";number-=500;}
        if(number>=400)  {result +="CD";number-=400;}
        if(number>=300)  {result +="C";number-=100;}
        if(number>=200)  {result +="C";number-=100;}
        if(number>=100)  {result +="C";number-=100;}
        if(number>=90)   {result +="XC";number-=90;}
        if(number>=50)   {result +="L";number-=50;}
        if(number>=40)   {result +="XL";number-=40;}
        if(number>=30)   {result +="X";number-=10;}
        if(number>=20)   {result +="X";number-=10;}
        if(number>=10)   {result +="X";number-=10;}
        if(number>=9)    {result +="IX";number-=9;}
        if(number>=5)    {result +="V";number-=5;}
        if(number>=4)    {result +="IV";number-=4;}
        if(number>=3)    {result +="III";number-=3;}
        if(number>=2)    {result +="II";number-=2;}
        if(number>=1)    {result +="I";number-=1;}

    }
    // Return a message or result
    return env->NewStringUTF(result.c_str());
}
