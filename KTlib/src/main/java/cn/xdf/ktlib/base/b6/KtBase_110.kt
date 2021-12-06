package cn.xdf.studylib.b6

/**
 * author:fumm
 * Date : 2021/ 11/ 30 10:04 上午
 * Dec : Kotlin语言的in-逆变学习
 **/

// 消费者 in T 逆变[in T 次泛型只能被修改 更新]
interface Consumer<in T>{
    // in T 代表整个消费者里面 ，这个T 只能被修改，不能读取

    // 只能被修改
    fun consumer(item:T)
    // 不能被读取
    // fun producer():T
}

open class Animal
open class Humanity :Animal()
open class Man:Humanity()
// ----------------------------------
class ConsumerClass1:Consumer<Animal>{
    override fun consumer(item: Animal) {
        println("消费者 Animal")
    }
}

fun main() {
    // 默认情况下：泛型的具体处的父类  是不可以 赋值给  泛型声明出的子类的
    // in :泛型具体处的父类 是可以赋值给  泛型的声明处的子类的
    // ? super T 就相当于 Kt里面的in,所以才可以 泛型父类对象 赋值给 泛型子类对象
    // List<? super String> list = new ArrayList<CharSequence>();
    val c1 :Consumer<Man> = ConsumerClass1()
}





