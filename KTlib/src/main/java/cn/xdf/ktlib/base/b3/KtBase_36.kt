package cn.xdf.studylib

import kotlin.math.log

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Kotlin语言的安全操作调用符
 **/

fun main() {
    var name: String? = "zhangsan"
    name = null
    // name 是可空类型 ，可能是null 要想使用name必须给出补救措施
    // name.capitalize()
    // name 如果为null ,?后面的一段代码不执行就不会引发空指针
    name?.capitalize()

    var t = name?.let { it -> //如果能执行到里面，it一定不为null
        if (it.isBlank()) {
            "defult"
        } else {
            it
        }
    }
    println(t)

    // !! 断言 不管name 是否为null 都会执行
    name = "jerry"
    var l = name!!.capitalize()

    // 使用 if
    if (name != null) {
        println(name)
    }

    // 使用 ?: 空合并操作符 ,如果有name为空就执行 ?: 后面的
    val na: String = name ?: "原来你是null"

    // 使用let + ?:
    val tt = name?.let { "[$it]" }?:"原来你是null!!"

}




