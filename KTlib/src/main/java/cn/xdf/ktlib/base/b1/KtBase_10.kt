package cn.xdf.studylib.b1

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : 编译时常量
 **/

// 编译时常量只能是常用的9种基本类型：(String 、Double 、Int ...)
// 提示： 修饰符const不适用于 局部变量 ( fun 中)
// 如果在函数之内定义，就必须在运行时才能调用函数赋值，何来编译时常量一说
const val  PI= 45
class KtBase_10 {
    // 只读类型变量
    val b = "c";
    fun main() {
        // 只读类型变量
        val a = "c"
    }
}