package BASIC

// when 等同于其他语言的switch
fun usage(orderType:Int):String{

    return when(orderType){
        1 -> "成交"
        2 -> "创建"
        3 -> "取消"
        else -> "其他"
    }
}

fun usage2(score:Int):String{

    return when(score){
        in 1..5 -> "不及格"
        6,7,8 -> "及格"
        9,10 -> "优秀"
        else -> "其他"
    }
}


fun main(argv:Array<String>){
    println(usage(2))
    println(usage2(3))

    val x = 11
    val result =  when{
        11 % 2 == 1 -> "x 是奇数"
        else -> "x 是偶数"
     }
    println(result)
}