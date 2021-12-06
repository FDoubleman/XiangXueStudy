package cn.xdf.studylib

import kotlin.math.log

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Kotlin中Nothing类型特点
 **/

fun main() {

}

private fun show(num:Int){

    when(num){
        // 抛出异常 程序终止
        -1 -> TODO("没有这种分数 ")
        in 0..59 -> println("不及格")
        in 60..100 -> println("及格")
    }
}

interface A {
    fun show()
}

class AImpl :A{
    override fun show() {
        // // 下面这句话不是注释 ，会终止程序
        TODO("Not yet implemented")
    }
}

