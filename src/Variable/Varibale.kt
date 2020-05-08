package Variable


fun main(argv:Array<String>){

//   println(Variable.max1(10,3))
    variableUsage()
}

// 函数
// 表达式函数体 省略return
fun max(a: Int, b: Int) = if(a > b) a else b

fun max1(a: Int, b: Int):Int{
    return if(a > b) a else b
}


// 变量
fun variableUsage(){
    // 变量
    // 字符串 自动类型推断
    val question = "we learn kotlin together"
    // Int
    val minuteOfDay = 24*60
    // 模板字符串
    println("one day has $minuteOfDay minutes")
    // Double
    var doubleValue = 7.5e6
    // Float
    var floatValue:Float = 1.234f
    // Boolean false true
    var isLastDay = false
    // char
    var c = 'a'
    c.toFloat()

    // 常量 value 对应java final
    val pi = Math.PI
    //   pi = 3.14 只能赋值一次

    // 可变常量 variable
    var feeling = "happy"
    feeling = "sad"

    println(question)
}