package cn.xdf.studylib.b6

/**
 * author:fumm
 * Date : 2021/ 11/ 29 3:47 下午
 * Dec : Koltin语言泛型类型约束学习
 **/
open class MyAny(name: String)
open class Person(name: String) : MyAny(name)
class Student(name: String) : Person(name)

// T:Person 相当于 java 的 T extends Person限定T的类型范围
// inputValue 限定T 和 T的子类
fun <T:Person> map(isMap:Boolean,inputValue: T) {
    inputValue.takeIf { isMap }
}

fun main() {
    val p = map(isMap = true,Student("tom"))
    println(p)
}