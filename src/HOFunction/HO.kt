package HOFunction

fun main(argv:Array<String>){

   val r =  generateSequence (0){it +1}
            .filter { it %2 == 0 }
            .map { it*3 }
            .take(3)
            .average()

    println(r)


}
