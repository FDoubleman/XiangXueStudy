package cn.xdf.studylib

import kotlin.math.log

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Kotlin函数引用
 **/

fun main() {
    // lambda 属于函数类型的对象，需要把method() 普通函数 变成函数类型的对象 (函数引用)
    val m1 = ::method
    val m2 = m1;
    val m3 = m2
    login("fumm", "123456", m3)
}

fun method(msg: String, code: Int) {
    //TODO
}
inline fun login(name: String, pwd: String, response: (String, Int) -> Unit) {
    if (name == null || pwd == null) {
        // 出现问题终止程序
        TODO("用户名 or 密码错误")
    }
    // 校验
    if (name.length > 3 && pwd.length > 3) {
        if (requestAPI(name, pwd)) {
            response("登陆成功", 200)
        } else {
            response("登陆失败", 404)
        }
    } else {
        // 出现问题终止程序
        TODO("用户名 or 密码错误")
    }
}



