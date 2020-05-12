package ENUM

// 枚举:列举所有的状态
enum class color{
    RED, YELLOW, BLUE
}

enum class ColorRGB(var r:Int, var g:Int, var b:Int){
    RED(255, 0, 0),
    YELLOW(255, 255, 255);

    fun rgb()= (r*256 +g)*256 + b
}

class Person(var hair:ColorRGB);

fun main(argv:Array<String>){

    val p = Person(ColorRGB.YELLOW)
    println("this person's hair is ${p.hair}")
    println(ColorRGB.YELLOW.rgb())

}
