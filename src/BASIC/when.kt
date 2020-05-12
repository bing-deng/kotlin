package BASIC


fun usage(orderType:Int):String{

   return when(orderType){
        1 -> "creat"
        2 -> "cancle"
        3 -> "done"
        else -> "其他"
    }
}
fun main(argv:Array<String>){

    println(usage(3))
}