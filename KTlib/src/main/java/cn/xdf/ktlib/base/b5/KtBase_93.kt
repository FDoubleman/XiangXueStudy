package cn.xdf.studylib.b5

/**
 * author:fumm
 * Date : 2021/ 11/ 26 3:10 下午
 * Dec : Kotlin 语言解构声明学习
 **/
// 普通类
class Student(var name: String, var age: Int, var info: String){
    // 注意事项：component0 声明解构时，字段必须和主构造函数参数一一对应
    // 从component1  component2 component3
    operator fun component1() =name
    operator fun component2() =age
    operator fun component3() =info
}
// 数据类型  默认就有解构
data class StudentData(var name: String, var age: Int, var info: String)

fun main(){
    var(name,age,info) =Student("tom",18,"猫")
    var(name2,age2,info2) =StudentData("tom",18,"猫")
    var(_,age3,_) =StudentData("tom",18,"猫")

    println("普通类 name $name age $age info $info")
    println("数据类 name2 $name2 age2 $age2 info2 $info2")
}