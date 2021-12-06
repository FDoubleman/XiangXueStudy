
package cn.xdf.studylib.b7

/**
 * author:fumm
 * Date : 2021/ 12/ 02 2:00 下午
 * Dec : 注解@JvmFild与Kotlin
 **/

class Student(){
    @JvmField
    val list = listOf<String>("tom","jerry","luna")

    fun showStudent(name:String = "tom",age:Int =18){

    }

    @JvmOverloads
    fun toast(name:String = "tom",age:Int =18){

    }
}

