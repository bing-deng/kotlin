package HOFunction

// 高阶函数：以另一个函数作为参数或者返回值的函数

// 函数作为参数
fun twoAndThree(operation:(Int,Int) ->Int){
    val result = operation(2,3)
    println("this result is $result")
}
// 函数名:(参数值) -> 返回值
fun String.filter(predicate: (Char) -> Boolean):String{
    val sb = StringBuffer()
    for(index in 0 until length){
        val element = get(index)
        if(predicate(element)) sb.append(element)
    }
    return sb.toString()
}

// 返回函数的函数
enum class Delivery{STANDANRD, EXPREDITD}
class Order(val itemCount:Int)

fun getShippingCostCalculator(delivery:Delivery):(Order)->Double{

    if(delivery == Delivery.EXPREDITD){
        return {order -> 6+1.2*order.itemCount}
    }
    return {order -> 1.2 * order.itemCount  }
}

// 数据类：得到equals hashCode toString
data class Person(val firstName:String,
                  val lastName:String,
                  val phoneNumber:String?)

class ContactListFilters{
    var prefix:String = ""
    var phoneNumberCanBeNull:Boolean = true

    fun getPredicate():(Person) ->Boolean{
        val startsWithPrefix = {p:Person->p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)}
        if(phoneNumberCanBeNull){
            return startsWithPrefix
        }
        return {startsWithPrefix(it) && it.phoneNumber != null}
    }

}


fun lookForAlice(people:List<Person>){
    // 任意定义一个标签名字
    people.forEach stop@{
        if(it.firstName == "Alice") return@stop
        println("Alice is missing")
    }

    // 使用lambda作为参数的函数的名字可以作为标签
    people.forEach{
        if(it.firstName == "Alice") return@forEach
        print("Alice missing")
     }

}


fun main(argv:Array<String>){
//    twoAndThree{a,b->a+b}
//    twoAndThree{a,b->a*b}

//    println("ab3c".filter { it in 'a'..'z' })
//    println("ab3c".filter {  c:Char->c in 'a'..'z' })
//    val calculator = getShippingCostCalculator(Delivery.EXPREDITD)
//    val result = calculator(Order(3))
//    println("Shiping costs ${result}")

    // data class
    val d1 = Person("Dmitry","Jemerov","12")
    val d2 = Person("Dmitry","Jemerov","12")
    val r = d1.hashCode()
    val r2 = d2.hashCode()


    val contacts= listOf(Person("Dmitry","Jemerov","123-4567"),
            Person("svelana","Isakova",null),
            Person("Billy","Mose","342-4567"))
    val contactListFilters = ContactListFilters()
    with(contactListFilters){
        prefix ="sv"
        phoneNumberCanBeNull = false
    }
//    println(contacts.filter { it.firstName.startsWith("sv") && it.phoneNumber !=null })
    println(contacts.filter (contactListFilters.getPredicate() ) )

    var find = listOf(Person("Alice","",""))

    println(lookForAlice(find))
}
