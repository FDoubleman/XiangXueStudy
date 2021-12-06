package cn.xdf.studylib

import kotlin.math.log

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Kotlin中的Unit函数特点
 **/

fun main() {

}

// :Unit 不写默认也有，代码返回的 忽略类型 == Unit类型类
// java void 是关键字
private fun method():Unit{
    print("good")
}

private fun method2():Unit{
    return print("good")
}

private fun method3(){
    print("good")
}

