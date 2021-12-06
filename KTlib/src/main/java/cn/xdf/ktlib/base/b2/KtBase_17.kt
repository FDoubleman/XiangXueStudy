package cn.xdf.studylib

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Kotlin中的函数参数的默认参数
 **/

// fun 默认是public
fun main() {
    action1("tom",8)
    action2("jerry",10)
    action2("cart")
}

fun action1(name:String ,age:Int){
    println("我的名字是${name},年龄是${age}")

}
// 函数参数添加默认值
fun action2(name:String ,age:Int =18){
    println("我的名字是${name},年龄是${age}")
}