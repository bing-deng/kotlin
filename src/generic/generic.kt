package generic

import java.lang.Appendable

class Box<T>(t: T) {
    var value = t
}

fun callGeneric(){
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    println(letters.slice(10..14))
}
// 调用泛化的高阶函数
fun callHiger(){
    val authors = listOf("Dmitry","Svetlana")
    val readers = mutableListOf<String>("Dmitry","Alics")

    println(readers.filter { it !in authors })
}

// 类型参数约束 限制泛型类和泛型函数实参的类型
fun <T:Number> oneHalf(value:T):Double{
    return value.toDouble() / 2.0;
}
fun <T:Comparable<T>> max(first: T, second:T):T{
//    first.compareTo(second)
    return if(first > second) first else second
}

// 为一个参数类型指定多个约束
fun<T> ensureTRailingPeriod(seq:T)
    where T:CharSequence,
          T:Appendable{
        if (!seq.endsWith("!")){
            seq.append("!")
        }
    }




fun main(argv:Array<String>){

    val box = Box(1)
    println(box.value)
    callHiger()
//println(listOf(1,2,3).sum())
    println(oneHalf(3))
    println(max("kotlin","java"))
    ensureTRailingPeriod(StringBuffer("kotlin"))

}