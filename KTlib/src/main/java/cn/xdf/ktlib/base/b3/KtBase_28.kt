package cn.xdf.studylib

import kotlin.math.log

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Kotlin语言的lambda学习
 **/

fun main() {

    // 匿名函数 == lambda表达式
    val add = { i1: Int, i2: Int ->
        "两数相加：${i1 + i2}"
    } // add 函数 （Int,Int）-> String
    println(add(1, 2))

    // 匿名函数：入参 Int        返回值 Any
    // lambda表达式 ：参数 Int   结果 Any
    val week = { week: Int ->
        when (week) {
            1 -> "今天周一"
            2 -> "今天周一"
            else -> -1
        }
    } // week()函数 (Int) -> Any
    println(week(2))
}


