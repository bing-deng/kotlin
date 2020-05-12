package BASIC

fun usage(){

    // while 水仙花数 153 = 1 5 3
    var num = 1000
    while(true){
        num--
        val i = num % 10;
        val j = num / 100;
        val k = num %100 / 10;
        val flower = i*i*i + j*j*j + k*k*k
        if(flower == num){
            println("最小的水仙花数是：$flower")
            break
        }
    }
}


fun main(argv:Array<String>){
    usage()
}