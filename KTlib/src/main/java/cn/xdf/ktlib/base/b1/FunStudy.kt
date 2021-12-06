package cn.xdf.studylib

/**
 * author:fumm
 * Date : 2021/ 11/ 17 10:57 上午
 * Dec : TODO
 **/

fun add1(){

}


fun add2():Unit{

}

//fun add3(n1 :Int ,n2:Int) :Int{
//    return n1+n2
//}
// 一行简写
//fun add3(n1 :Int ,n2:Int) :Int = n1+n2

// 返回类型推断 返回类型为 Int
//fun add3(n1 :Int ,n2:Int) = n1+n2

// 返回类型推断 返回类型为 Double
fun add3(n1 :Int ,n2:Int) = n1+n2.toDouble()

// 返回类型推断 返回类型为 String
fun add3() ="Jerry"