package cn.xdf.studylib

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : when 表达式
 **/

fun main() {
    val week =5
    // java 的 if 是语句
    // KT 的 if 是表达式 有返回值

    // 返回类型不确定： Any == object
    val info =when(week){
        1 ->"周一"
        2 ->"周二"
        3 ->"周三"
        4 ->"周四"
        else ->{
            // 也可以不返回
            print("今天是周末")
        }
    }
    print(info)
}
