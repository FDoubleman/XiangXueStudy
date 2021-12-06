package cn.xdf.studylib

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Kotlin的函数头学习
 **/

// fun 默认是public
private fun main() {


}

private fun method01(nam: Int): Int {
    return 200
}

// 上面的Kt函数，背后会变成下面的Java代码
//private static final int method01(){
//    return 200;
//}