package BASIC

import java.io.BufferedReader
import java.lang.NumberFormatException


fun main(argv:Array<String>){

    val num = "3"
    try{
        Integer.parseInt(num)
    }catch(e:NumberFormatException){

    }finally {

    }
}