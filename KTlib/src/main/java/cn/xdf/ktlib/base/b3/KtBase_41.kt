package cn.xdf.studylib.b3

import kotlin.math.log

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Kotlin语法中异常处理和自定义异常特点
 **/

fun main() {
    try {
        var name: String? = null
        checkException(name)

        checkNotNull(name)
        requireNotNull(name)

        println(name!!.length)
    } catch (e: Exception) {
        print(" cat $e")
    }
}

fun checkException(name: String?) {
    name ?: throw CustomException()
}

class CustomException : IllegalArgumentException("tom")



