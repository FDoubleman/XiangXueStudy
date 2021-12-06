package cn.xdf.studylib

import kotlin.math.log

/**
 * author:fumm
 * Date : 2021/ 11/ 17 1:43 下午
 * Dec : 函数中 参数 是函数 的 函数
 **/

fun main() {

    loginAPI("fumm", "123456") { msg, code ->
        println("登陆结果：msg${msg}  code:${code}")
    }
}

const val USER_NAME_DB = "fumm"
const val USER_PWD_DB = "123456"

fun loginAPI(name: String, pwd: String, response: (msg: String, code: Int) -> Unit) {

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


fun requestAPI(name: String, pwd: String): Boolean {
    return name == USER_NAME_DB && pwd == USER_PWD_DB
}



