package BASIC


fun usage(){
    var sum = 0
    for(i in 1..100){
        sum += i
    }

    println(sum)
    // 从6 到 0 步长位 2
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    for(i in "abcdefg"){
        print(i.toUpperCase())
    }
}
// break 1000以内最小的水仙花数
fun usage2(){

    var num = 100
    while(true){
        num++
        val i = num % 10  // 个位
        val j = num / 100 // 百位
        val k = num % 100 /10 // 十位
        val flower = i*i*i + j*j*j + k*k*k
        if(flower == num){
            println("the first flower num is :$num")
            break
        }

    }
}

fun main(argv:Array<String>){

    usage()
    usage2()
}