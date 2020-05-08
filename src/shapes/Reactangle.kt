package shapes
import java.util.Random

class Reactangle(val height:Int, val width:Int){

    val isSquare:Boolean
        get() = height == width

}

fun createRandomReactangle():Reactangle{
    val r = Random()
    return Reactangle(r.nextInt(), r.nextInt())
}

//fun Variable.Person.main(argv:Array<String>){
//    val a = createRandomReactangle()
////    val a = Reactangle(2,2)
//    println("height :${a.height} width:${a.width} isSqure: ${a.isSquare}")
//}