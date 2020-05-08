package Person

class Person {
    // 属性
    // var 提供 getter 和 setter
    var name: String = "Sherlock"
    var street: String = "Baker"
    val city: String = "London"
    var state: String? = null
    var zip: String = "123456"
    var isMarrid = false

    fun description(){
        println("i am $name ,i live in $city $street")
    }
    // 自定义getter
    val marriage:String
        get(){
            return if(isMarrid )
                "I am married"
            else
                "I am not married"
        }
}


fun main(argv:Array<String>){

    val ads = Person()
    // getter
    println(ads.name)
    // setter
    ads.name = "Sherlock copy"
    // 如果变量为val 不可赋值 使用其setter 方法
    //   address.city = "New York"
    println(ads.name)
    println(ads.description())
    ads.isMarrid = true
    println(ads.marriage)
}
