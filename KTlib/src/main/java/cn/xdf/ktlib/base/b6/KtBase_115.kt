package cn.xdf.studylib.b6

/**
 * author:fumm
 * Date : 2021/ 11/ 30 2:41 下午
 * Dec : Kotlin语言的泛型扩展函数
 **/
// 1.String 类型输出长度
fun <T> T.showContentInfo() = println("${if (this is String) "字符串长度${this.length}" else "你不是String类型" }")
// 2.显示调用时间
fun <T> T.showTime() = println("当前时间：${System.currentTimeMillis()}")
// 3.显示调用者类型
fun <T> T.showTypesAction()=
    when(this){
        is String ->"String 类型"
        is Int ->"Int 类型"
        is Char ->"Char 类型"
        is Float ->"Float 类型"
        is Double ->"Double 类型"
        is Boolean ->"Boolean 类型"
        is Unit ->"Unit 类型"
        else ->"类型未知"
    }

fun main() {
    344.showContentInfo()
    true.showContentInfo()
    'c'.showContentInfo()
    "abc".showContentInfo()
    println()
    344.showTime()
    true.showTime()
    'c'.showTime()
    "abc".showTime()
    println()
    println(344.showTypesAction())
    println(true.showTypesAction())
    println('c'.showTypesAction())
    println("abc".showTypesAction())
}