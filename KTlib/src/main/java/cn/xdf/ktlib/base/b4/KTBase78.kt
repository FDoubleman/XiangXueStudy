package cn.xdf.studylib.b4

/**
 * author:fumm
 * Date : 2021/ 11/ 22 8:40 下午
 * Dec : Kotlin 语言延迟初始化
 **/
class KTBase78() {// 主构造
    // 延时初始化
    lateinit var name:String
    // 1、初始化
    fun request(){
        name = "初始化 name"
    }
    // 2、使用
    fun useName(){
        println("使用 name...$name")
    }
}

fun main() {

}