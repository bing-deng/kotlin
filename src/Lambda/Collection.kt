package Lambda

// 结合的函数式API
// filter 和 map 形成了集合操作的基础
fun filter(){
    // 过滤
    val list = arrayListOf(1,2,3,4)
    val result = list.filter{it %2 == 0}
    val type = result is List
    println(type)
    print("result is type of ${result.javaClass.kotlin}  $result  ")
}

fun map(){
    val people = listOf(Person("Alice", 29), Person("Bob",31))
    val nameList = people.map{it.name}
    println(nameList)
    val name = people.filter{it.age > 30}.map { it.name }
//    val name = people.filter{it.age > 30}.map { (Person::name).name }
    println(name)
}

fun dict(){
    val numbers = mapOf(0 to "zero", 1 to "one")
    // mapValues mapKeys filterKeys filterValues
    val r = numbers.mapValues { it.value.capitalize() }
    print("${r.javaClass.kotlin}  $r")
}

// any all count find :根据条件筛选
fun aacf(){
    val canBeInClub27 = {p:Person -> p.age <=27}
    val people = listOf(Person("Alice", 24), Person("Bob",31))
    // 全部符合为true
    val allResult = people.all(canBeInClub27)
    // 至少1个符合为true
    val anyResult = people.all(canBeInClub27)
    val countResult = people.count(canBeInClub27)
    // 只返回符合条件的第一个元素
    val findResult = people.find (canBeInClub27)
    println("是否全部符合条件 : $allResult 至少一个符合:$anyResult 符合个数:$countResult name:${findResult?.name}" )
}

// group by
fun groupBy(){
    val people = listOf(Person("Alice", 24), Person("Bob",31),Person("Alice2", 24), Person("Bob2",31))
    val result = people.groupBy { it.age }
    println("${result.javaClass.kotlin}")
    println("${result}")
}

fun String.first():Char=this.get(0)
fun groupBy2(){
    val list = listOf("book","bad","road")
    val result = list.groupBy { it.first() }
    println(result.getValue('b'))
}

// flatMap and flatten

class Book(val title:String, val authors:List<String>);

fun fmfa(){
    var strings = listOf("abc","def")
    var r = strings.flatMap { it.toList() }
    println(r)
    val books = listOf(Book("Thrusday next", listOf("Jasper Fforde","Mort")),Book("Mort", listOf("Terry Pratchett")),Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))
    var br = books.flatMap { it.authors }.toSet()
    println(br)

    val deepList = listOf(listOf(1), listOf(2, 3), listOf(4, 5, 6))
    println(deepList.flatten()) // [1, 2, 3, 4, 5, 6]
}
// sequnence
fun sequnence(){
    val people = listOf(Person("Alice", 24), Person("Bob",31),Person("Alice2", 24), Person("Bob2",31))
    // 链式调用
    println(people.map( Person::name ).filter{it.startsWith("A")})
    // 高效处理
    println(people.asSequence().map( Person::name ).filter{it.startsWith("A")}.toList())
}

// 带接受者的lambda :with 和 apply
fun alphabert():String{
    val stringBuilder = StringBuilder()
    return with(stringBuilder){
        for (letter in 'A'..'Z'){
            append(letter)
        }
        toString()
    }

}

// 类似扩展方法 ，任何类都可以加apply
fun alphabertApply() = StringBuilder().apply(){
    for(letter in 'A'..'Z'){
        append(letter)
    }
}.toString()

fun main(argv:Array<String>){
//    filter()
//    map()
//    dict()
//    aacf()
//    groupBy()
//    groupBy2()
//    fmfa()
    sequnence()
}

