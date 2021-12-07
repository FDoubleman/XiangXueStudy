// TODO 高阶函数第一版
fun main() {
    loginEngine("Derry 2", "123456")
}

// 登录功能 高阶函数完成
private fun loginEngine(userName: String, userPwd: String) : Unit {
    // 使用高阶函数
    loginServer(userName, userPwd) { name, pwd ->
        if (name == "Derry" && pwd == "123456") {
            println("恭喜：${name} 登录成功")
        } else {
            println("登录失败")
        }
    }

    login2Server(userName,userPwd) {
        if (it) "登陆成功" else "登陆失败"
    }
}

// 高阶函数 规则
private fun loginServer(userName: String, userPwd: String, responseResult: (String, String) -> Unit) =
    // 做 name pwd 的校验工作
    // ...
    responseResult(userName, userPwd)



private fun login2Server(name:String,pwd:String,loginAction:(Boolean)->String){
    // 网络请求
    val isOK= true
    if(isOK){
        loginAction(isOK)
    }else{
        loginAction(isOK)
    }

}