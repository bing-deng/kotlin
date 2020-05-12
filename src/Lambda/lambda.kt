package Lambda

import java.io.File.separator

// 经常与集合使用
// 与任意java 库使用
// java8 引入lambda
// 函数式编程：把函数当做值传递

/*
* val n :String?
    n = null
    val m:String
    m = null
* */
class Person(val name:String,val age:Int);

fun printWithPrefix(message:Collection<String>, prefix:String){

    message.forEach{
        // m:String->println("$prefix $m")
        println("$prefix $it")

    }

}

fun simpleLambada(){
    // 参数和函数体 ，kotlin的lambda表达式需要花括号包起来
    val sum = {x:Int, y:Int ->x+y}
    println(sum(1,2))
}

fun maxAge(){
    // 任务 搜索列表中年龄最大的
    val people = listOf(Person("Alice", 29), Person("Bob",31))
//    val p = people.maxBy { p:Person -> p.age }
//    val p = people.maxBy { p -> p.age } // 编译器推导出类型
//    val p = people.maxBy { it.age } //it 自动生成的参数名
    val getmax = {p:Person -> p.age}
    val p = people.maxBy(getmax)
    println("max age is $p?.age")

}

// 成员引用 kotlin 和java8 一样，如果把函数转成一个值，就可以传递 使用字符 ::
fun lambdaAsValue(){

    // 成员引用
    val getAge = Person::age
    val people = listOf(Person("Alice", 29), Person("Bob",31))
    val p = people.maxBy(getAge)
    println("max age is $p?.age")
}
fun main(argv:Array<String>){

//    simpleLambada()
//    maxAge()

    printWithPrefix(listOf("403 Forbidden", "404 Not Found"),"error")


}