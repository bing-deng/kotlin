package ENUM
// https://convertingcolors.com/decimal-color-16711680.html

// 枚举关键字 enum class
enum class color{
    RED , ORANGE , YELLOW, GREEN , BLUE
}

enum class colorRGB(var r:Int ,var g:Int, var b:Int){
    // kotlin 的枚举可以声明属性和方法
    RED(255,0,0),
    // kotlin 必须以分号结尾
    YELLOW(255, 255, 255);

    fun rgb() = (r * 256 +g)*256 + b
}

// 类的参数 必须声明类型
class P(var hair:colorRGB);

fun main(argv:Array<String>){

    val peter = P(colorRGB.YELLOW)
    peter.hair = colorRGB.RED
    println("peter's hair color is ${peter.hair}")
    println(colorRGB.RED.rgb())

}
