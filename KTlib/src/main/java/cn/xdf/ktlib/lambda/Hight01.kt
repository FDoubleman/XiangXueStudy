package cn.xdf.ktlib.lambda

import kotlin.concurrent.thread

/**
 * author:fumm
 * Date : 2021/ 12/ 07 2:28 下午
 * Dec : TODO
 **/

fun test00() = { action: (Int, Int) -> String, info: String ->
    false
    "dog"
    val r = action(20,10)

    println("调用 test 函数 最终 $r + $info")
}

fun main() {
    test00()({ n1, n2 ->
        "两数相加：${n1+n2}"
    }, "tom")
    "to".apply {

    }

    thread {

    }
}