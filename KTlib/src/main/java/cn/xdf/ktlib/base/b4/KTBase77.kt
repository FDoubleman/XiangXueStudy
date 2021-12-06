package cn.xdf.studylib.b4

/**
 * author:fumm
 * Date : 2021/ 11/ 22 8:40 下午
 * Dec : Kotlin 语言构造初始化顺序学习
 **/
// 第一步 生成 val age
class KTBase77(_name: String, val age: Int) {// 主构造
    // 第二步 生成val name,
    // 和 init 平级 ，主要看先后顺序
    val name = _name

    init {
        // 第三步 生成 nameValue
        val nameValue = _name
        println("init 代码块 nameValue:$nameValue")
    }
    constructor(_name: String, age: Int, info: String) : this(_name, age) {
        // 第四步 生成次构造的细节
        println("次构造函数 name$_name  ,age:$age  info:$info")
    }
}

fun main() {
    // 调用次构造
    KTBase77("fmm", 18, "男")
}