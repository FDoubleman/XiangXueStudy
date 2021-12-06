package cn.xdf.studylib.b4

/**
 * author:fumm
 * Date : 2021/ 11/ 22 8:07 下午
 * Dec : 76.Kotlin 初始化块学习
 **/
// name: String 属于临时类型，必须二次转换
class KTBase74(_name: String) {// 主构造
    var name =_name
    // 次构造函数 ：必须要调用主构造函数否则 不通过，
    constructor(name: String, age: Int) : this(name) {
        println("两个参数的构造函数：name:$name  age:$age")
    }

    // 这不是Java static代码块
    // 相当于 java {} 构造代码块
    // 初始化块   init代码块 当主构造函数调用的时候就会调用 init(), 可以使用 临时类型
    init {
        println("主构造函数被调用了$_name")
        // 校验参数  会崩溃
        require(_name.isEmpty()){
            "传入参数校验失败！！！"
        }
    }
}

fun main(){

}