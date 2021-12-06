package cn.xdf.studylib.b6

/**
 * author:fumm
 * Date : 2021/ 12/ 01 10:25 上午
 * Dec : Kotlin 语言apply学习
 **/

// 需求：
// 1、mApply 函数 返回自己
// 2、mApply 持有this
// 解释：
// 1、fun <T> 函数中声明一个泛型
// 2、T.mApply 对泛型T 函数扩展，让所有类型，都可以xxx.mApply 泛型扩展
// 3、T.()->Unit 让匿名函数(lambda中持有this) ，在lambda中不需要返回值，(T)->Unit 让匿名函数持有it
// 4、返回this 可以链式调用
private inline fun <T> T.mApply(lambdaAction: T.() -> Unit): T {
    lambdaAction()
    return this
}

private inline fun <T> T.mApply2(age: Int, lambdaAction: T.(Int) -> Unit): T {
    lambdaAction(age)
    return this
}

fun main() {
    val p = "Tom".mApply {
        println("修改后的 [[$this]]")
    }
    println("原始的：$p")
//    p.mApply2(20,{
//        println(it)
//        println(this)
//    })
    p.mApply2(20) {
        println(this)
        println(it)
    }
    p.mApply2(20){age:Int ->
        println(this)
        println(age)
    }
}