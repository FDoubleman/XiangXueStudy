package cn.xdf.studylib.b6

import java.util.*

/**
 * author:fumm
 * Date : 2021/ 11/ 29 5:02 下午
 * Dec : Kotlin语言的[]操作 学习
 **/
class KtBase_108<INPUT>(private val isR: Boolean, vararg objects: INPUT) {

    private val objectArray: Array<out INPUT> = objects

    fun get1(): Array<out INPUT>? = objectArray.takeIf { isR }

    // 有可能是 Array<out INPUT> 、String ，使用Any代替
    fun get2() = objectArray.takeIf { isR } ?: "你是 null"

    //
    fun get3(index: Int): INPUT? = objectArray[index].takeIf { isR }

    // 有可能是 INPUT? 、String  :使用Any替代
    fun get4(index: Int): Any? = objectArray[index].takeIf { isR } ?: "你是null" ?: null

    // 运算符[] 重载
    operator fun get(index: Int): INPUT? = objectArray[index].takeIf { isR }
}

fun main() {
    val p1 = KtBase_108(isR = true,"tom",100,100.1f,'F')
    // 使用运算符
    println(p1[0])
    println(p1[1])
}