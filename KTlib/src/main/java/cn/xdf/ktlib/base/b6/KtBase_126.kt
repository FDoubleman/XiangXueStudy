package cn.xdf.studylib.b6

/**
 * author:fumm
 * Date : 2021/ 12/ 01 3:11 下午
 * Dec : Kotlin语言学习 filter zip
 **/
fun main() {
    val list = listOf("java", "C", "python", "kotlin")
   val fList = list.filter {
        it !=="C"
    }
    // 返回 true:不过滤 false: 不满足条件，过滤
    println(fList) // [java, python, kotlin]
    val r = "tom".filter {
        it !='o'
    }
    println(r) // tm

    //about zip-------------------------------------
    println("---------")
    // 原理就是：把第一个集合 和 第二个集合 合并起来，创建新的集合 并返回
    //          创建新的集合（元素,元素，元素） 元素Pair(K,V) K代替第一个集合元素 V代替
    val nameList = listOf("张三","李四","王五")
    val ageList = listOf<Int>(12,18,10,20)
    val zipList :List<Pair<String,Int>> = nameList.zip(ageList)
    println(zipList)
    println(zipList.toList())
    println(zipList.toMap())
    println(zipList.toSet())
    zipList.forEach{
        println("key ${it.first} ,value${it.second}")
    }
    // map 解构方式
    zipList.toMap().forEach { t, u ->
        println("key ${t} ,value${u}")
    }
}