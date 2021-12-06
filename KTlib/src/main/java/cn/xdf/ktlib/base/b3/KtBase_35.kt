package cn.xdf.studylib

import kotlin.math.log

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Kotlin函数不能为空特性
 **/

fun main() {
    // 特点一：默认不可空 类型，不能随意给null
    var name = "tom"

    // 提示：不能是非空类型的String
    // name =null

    // 特点二：声明时 为可空类型
    var name2: String? = "jerry"
    name2 = null
    println(name2)
}




