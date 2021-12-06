package cn.xdf.studylib.b5

/**
 * author:fumm
 * Date : 2021/ 11/ 26 10:22 上午
 * Dec : Kotlin嵌套类学习
 **/
class KtBase_90 {


}

class Body(_body:String){
    val body = _body
    fun run(){
        // 外部类 能访问嵌套类方法 属性
        Heart().run()
        //
        Heart2().run()
    }
    fun run2(){}
    // 嵌套类：外部类 能访问嵌套类方法 属性
    //        嵌套类 不等访问外部类方法 属性

    class Heart(){
        fun run(){
            // 嵌套类 不等访问外部类方法 属性
            // println("嵌套类 ：$body")
        }
    }
    // 内部类：使用 inner修饰的类为内部类
    //         内部类和 外部类 之间的参数和方法能互相访问
    inner class Heart2(){
        fun run(){
            println("嵌套类 ：$body")
            run2()
        }
    }
}

fun main(){
    // 使用内部类
    Body("isOk").Heart2().run()
    // 使用qian't
    Body.Heart().run()
}