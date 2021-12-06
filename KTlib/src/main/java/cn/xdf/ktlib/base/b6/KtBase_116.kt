package cn.xdf.studylib.b6

/**
 * author:fumm
 * Date : 2021/ 11/ 30 3:09 下午
 * Dec : Kotlin学习
 **/

//fun <I> I.mLet(lambdaAction: (I) -> Unit) = lambdaAction(this)
// 1、fun <I, O> 函数声明两个泛型
// 2、I.mLet 对 I 泛型进行扩展 ，即任意类型。
// 3、lambdaAction: (I) -> O :参数lambda 。入参: 为任意类型  出参：为任意类型
// 4、:O 返回值是泛型 O 的类型 ，即任意类型
// 5、lambdaAction(this) this：即对 I进行函数扩展，在整个扩展函数里面，I == this
inline fun <I, O> I.mLet(lambdaAction: (I) -> O) :O = lambdaAction(this)

fun main() {
    val r = "tom".mLet {
        println(it)
    }
    println(r)
    val r2 = "tom".mLet {
        123
    }
    println(r2)
}