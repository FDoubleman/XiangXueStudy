package cn.xdf.studylib.b6

import java.io.File
import java.nio.charset.Charset
import java.util.ArrayList

/**
 * author:fumm
 * Date : 2021/ 11/ 30 2:08 下午
 * Dec : Kotlin扩展函数学习
 **/
// 假如对该类(代码是开源的 JDK源码) 添加方法
class KtBase_113(val name: String, val age: Int)

// 增加扩展函数
// public static final void show(@NotNull KtBase_113 $this$show) { ... }
fun KtBase_113.show() {
    println("我是扩展函数 ${this.name} ${this.age}")
}

// 对String 添加 静态 addExrAction()函数
fun String.addExrAction(num: Int) = this + "@".repeat(num)

// 对String 添加 静态  showStr函数
fun String.showStr() = println(this)

// 最超类进行一个函数 扩展
fun Any.showPrintlnContent() = println(this)

// 最超类进行一个函数 扩展 链式调用
fun Any.showPrintlnContent2(): Any {
    println(this)
    return this
}

fun main() {
    val p = KtBase_113("tom", 12)
    p.show()
    println("Jerry".addExrAction(5))
    "Tom".showStr()

    // Any.showPrintlnContent()
    123.showPrintlnContent()
    "kkkk".showPrintlnContent()
    "luna".showPrintlnContent2().showPrintlnContent2().showPrintlnContent2()
    // 优先调用我们自己定义的
    File("").readLines()
}
// 1、如果我们写两个一样的扩展函数，编译不通过
// 2、KT内置扩展函数，被我们重复定义。属于覆盖 、而且优先我们自己定义的扩展函数
fun File.readLines(charset: Charset = Charsets.UTF_8): List<String> {
    val result = ArrayList<String>()
    forEachLine(charset) { result.add(it); }
    return result
}