package cn.xdf.studylib

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : 字符串模板
 **/

fun main() {
    val granden = "黄山"
    val time = 6

    print("周末去$granden,已经玩了$time 次！")

    // KT的if 是表达式
    val isLogin = false
    println("登陆结果：${if (isLogin) "登陆成功" else "登陆失败"}")

}
