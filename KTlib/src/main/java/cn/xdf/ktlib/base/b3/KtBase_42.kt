package cn.xdf.studylib

import kotlin.math.log

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Kotlin语法中异常处理和自定义异常特点
 **/
val INFO ="I love java and kotlin"
fun main() {

    // 字符串 截取
    val index = INFO.indexOf("j")
    val newInfo = INFO.substring(0,index)
    //val newInfo2 =INFO.substring(0 rang index)
    println(newInfo)
}




