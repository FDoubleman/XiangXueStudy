package cn.xdf.studylib.b5

/**
 * author:fumm
 * Date : 2021/ 11/ 26 3:21 下午
 * Dec : Kotlin语言运算符重载
 **/
data class AddClass(var num1: Int, var num2: Int) {

    operator fun plus(addClass: AddClass): Int {
        return (num1 + addClass.num1) + (num2 + addClass.num2)
    }
}

fun main() {
    println("运算符重载结果${AddClass(1, 1) + AddClass(2, 2)}")
}