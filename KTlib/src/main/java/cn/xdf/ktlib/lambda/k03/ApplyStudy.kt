package k03

import java.io.File

fun main() {
    // TODO 官方的：
    // Region+ ===
    // 错误的用法
//    val r2 : File = File("D:\\a.txt").apply {
//        readLines()
//    }.apply {
//        setWritable(true)
//    }.apply {
//        setReadable(true)
//    }.apply {
//        // ...
//    }

    // 正确用法
//    File("D:\\a.txt").apply {
//        readLines()
//    }.apply {
//        setWritable(true)
//    }.apply {
//        setReadable(true)
//    }.apply {
//        // ...
//    }
    // endRegion

    val r : String = "Derry".apply {
        ""
        true
        9
        println(this)
    }.apply {

    }.apply {

    }.apply {

    }


    // TODO 我们自己写的人
    "Derry".myApply {

    }.myApply {

    }.myApply {

    }

    123.myApply {

    }

    true.myApply {

    }.myApply {

    }

   var p = "ada".mApply {

       this+"123456"
    }.mApply {

   }
    println(" pppp is $p")

   val t:Int = "tom".let {

       99
    }
    val j:Int = "jerry".mLet {
        true
        99
        0
        ""
        10
    }

    val list = listOf("张三","赵德胜","王文革")
    list.mForEach {
        println("$it")
    }
    list.mForEach2 {
        println("$this")
    }
   val pp = "Tom2".mTakeIf {
        false // null
        true // Tom2
    }
    println(pp)
}

private inline fun<E> Iterable<E>.mForEach(action:(E)->Unit){
    for(item in this){
        action(item)
    }
}

private inline fun<E> Iterable<E>.mForEach2(action:E.()->Unit){
    for(item in this){
        action(item)
    }
}

private inline fun <T,R> T.mLet(action:(T)->R):R{
    return action(this)
}

// 1、定义高阶函数框架： private inline fun mApply(){}
// 2、确定使用范围 全部类型都能用：使用泛型T  的扩展 T.mApply
//    只有List map set能用 使用 Iterable<E>  的扩展 Iterable<E>.mForEach
//
// 3、确认lambda {} 中 是需要 this 还是 it ; 形式 注意和扩展函数的 形式区分！！！！
//        this : T.()
//         it  : (T)
//
// 4、确定是否有 返回值，以及返回值类型
//      fun <T> T.mApply(action:T.()->Unit):T{} // 需要返回值 T
//      inline fun<E> Iterable<E>.mForEach(action:(E)->Unit){} // 不需要返回值
//      inline fun <T,R> T.mLet(action:(T)->R):R {} // 需要返回值 R(不明确，使用泛型)
//      inline fun <T> T.mLet(action:(T)->String):String {} // 需要返回值 String(明确)
//      inline fun<T> T.mTakeIf(action:(T)->Boolean):T? {} // 需要返回值 可为空 T?
//
// 5、调用lambda action()  、return action(this)
private inline fun <T> T.mApply(action:T.()->Unit):T{
    //action()
    action(this)
    return this
}
// 需求：true 返回 自己，  false会返回一个null
private inline fun<T> T.mTakeIf(action:(T)->Boolean):T?{
    val lambdaResult = action(this)
    return if(lambdaResult) this else null
}

// 只要是高阶函数，必须用inline修饰，为什么，因为内部会对lambda做优化
// I.myApply 万能类型.myApply 所有类型都可以调用
// lambda : I.()  对I泛型进行了匿名函数扩展  好处 lambda持有this == I == "Derry"
// : I 为了链式调用
//  lambda() 调用执行
//
private inline fun <I> I.myApply(lambda : I.() -> Unit) : I {
    lambda()
    return this
}