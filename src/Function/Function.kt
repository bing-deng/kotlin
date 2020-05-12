package Function

import java.lang.StringBuilder

// 扩展函数和属性
fun String.lastChar():Char = this.get(this.length - 1)
// 扩展属性
var StringBuilder.lastChar: Char
    get() = get(length -1 )
    set(value: Char){
        this.setCharAt(length -1 ,value)
    }
// 定义默认值 降低了函数重载的必要性
fun paramList( p1:String ="1",p2:String ="2",p3:String ="3",p4:String ="4"){

    println("$p1 $p2 $p3 $p4")
}

fun main(argv:Array<String>){

    paramList("100","200")
    val k = StringBuilder("kotlin")
    k.lastChar = '?'
    println(k)
    println("kotlin".lastChar())

}