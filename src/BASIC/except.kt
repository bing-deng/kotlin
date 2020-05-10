package BASIC

import java.io.BufferedReader
import java.lang.NumberFormatException


fun main(argv:Array<String>){

    val num = readLine()
    try{
         println(Integer.parseInt(num))
    }catch (e: NumberFormatException){
        println("exception")
    }finally {

    }
}