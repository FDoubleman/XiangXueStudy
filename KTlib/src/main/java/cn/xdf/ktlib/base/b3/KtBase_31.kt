package cn.xdf.studylib

import kotlin.math.log

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : Kotlin语言内联函数的学习
 **/

fun main() {
    // 方式三
    loginAPI3("fumm", "123456") { msg, code ->
        println("登陆结果：msg${msg}  code:${code}")
    }
}

 inline fun loginAPI3(name: String, pwd: String, response: (msg: String, code: Int) -> Unit) {

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



