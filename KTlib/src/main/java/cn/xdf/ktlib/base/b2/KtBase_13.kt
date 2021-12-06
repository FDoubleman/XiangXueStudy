package cn.xdf.studylib

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Rang 表达式
 **/

fun main() {
    val num =102;
    // rang 范围 从哪里 到哪里
    if(num in 10..59){
        print("不及格")
    }else if(num  in 60..100){
        print("及格")
    }else if(num !in 0..100){
        print("不在范围之内")
    }
}