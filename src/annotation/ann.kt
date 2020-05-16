package annotation

import kotlin.reflect.full.declaredFunctions

class Student constructor(name:String,age:Int){
    val name:String
    val age:Int
    init {
        this.name = name
        this.age = age
    }

    fun description(){
        println("this is $name ,age is $age")
    }
}

class Student2  private constructor(name:String,age:Int){
    val name:String
    val age:Int
    init {
        this.name = name
        this.age = age
    }
}

class Student3 {
    private var name:String
    private var age:Int
    private var sex:String = ""
    constructor(name:String,age:Int){
        this.name = name
        this.age = age
    }
    constructor(name: String,age: Int,sex:String):this(name,age){
        this.sex = sex
    }
}

fun main(argv:Array<String>){
    //1.通过实例.javaClass
    var s = Student("Li",12)

    println(s.javaClass)

    //2.通过类Kclass类的.java属性
    println(Student::class.java)
    println(Student3::class.constructors)
    println(Student::class.declaredFunctions)
    println(Student::class.qualifiedName)

//    val s3 = Student3("Liu",10)
    val s33 = Student3("Liu",10,"man")



}


/*
Kotlin可以通过下面的方法，获取所有的构造函数。
反射机制，使得我们可以在运行期获取Java类的字节码文件中的构造函数，成员变量，成员函数等信息。这
//返回这个类的所有构造器
public val constructors: Collection<KFunction<T>>


Kotlin中获取成员变量和成员函数的方法有6个。


//返回类可访问的所有函数和属性，包括继承自基类的，但是不包括构造器
override val members: Collection<KCallable<*>>
//返回类声明的所有函数
val KClass<*>.declaredFunctions: Collection<KFunction<*>>
//返回类的扩展函数
val KClass<*>.declaredMemberExtensionFunctions: Collection<KFunction<*>>
//返回类的扩展属性
val <T : Any> KClass<T>.declaredMemberExtensionProperties: Collection<KProperty2<T, *, *>>
//返回类自身声明的成员函数
val KClass<*>.declaredMemberFunctions: Collection<KFunction<*>>
//返回类自身声明的成员变量（属性）
val <T : Any> KClass<T>.declaredMemberProperties: Collection<KProperty1<T, *>>
*/

//

/*
* //1.返回类的名字
public val simpleName: String?
//2.返回类的全包名
public val qualifiedName: String?
//3.如果这个类声明为object，则返回其实例，否则返回null
public val objectInstance: T?
//4.返回类的可见性
@SinceKotlin("1.1")
public val visibility: KVisibility?
//5.判断类是否为final类（在Kotlin中，类默认是final的，除非这个类声明为open或者abstract)
@SinceKotlin("1.1")
public val isFinal: Boolean
//6.判断类是否是open的(abstract类也是open的），表示这个类可以被继承
@SinceKotlin("1.1")
public val isOpen: Boolean
//7.判断类是否为抽象类
@SinceKotlin("1.1")
public val isAbstract: Boolean
//8.判断类是否为密封类，密封类:用sealed修饰，其子类只能在其内部定义
@SinceKotlin("1.1")
public val isSealed: Boolean
//9.判断类是否为data类
@SinceKotlin("1.1")
public val isData: Boolean
//10.判断类是否为成员类
@SinceKotlin("1.1")
public val isInner: Boolean
//11.判断类是否为companion object
@SinceKotlin("1.1")
public val isCompanion: Boolean
//12.返回类中定义的其他类，包括内部类(inner class声明的)和嵌套类(class声明的)
public val nestedClasses: Collection<KClass<*>>
//13.判断一个对象是否为此类的实例
@SinceKotlin("1.1")
public fun isInstance(value: Any?): Boolean
//14.返回这个类的泛型列表
@SinceKotlin("1.1")
public val typeParameters: List<KTypeParameter>
//15.类其直接基类的列表
@SinceKotlin("1.1")
public val supertypes: List<KType>
//16.返回类所有的基类
val KClass<*>.allSuperclasses: Collection<KClass<*>>
//17.返回类的伴生对象companionObject
val KClass<*>.companionObject: KClass<*>?
* */



