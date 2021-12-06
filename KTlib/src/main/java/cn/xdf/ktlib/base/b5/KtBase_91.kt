package cn.xdf.studylib.b5

/**
 * author:fumm
 * Date : 2021/ 11/ 26 10:45 上午
 * Dec : Kotlin 数据类学习
 **/
class KtBase_91 {
}

// 普通类：默认有 get\set方法、构造函数
class Response(var msg:String,var code:Int,var info:String)

// 数据类：默认有 get\set方法、构造函数 、结构操作、copy、toString、hashCode、equals
//       只管主构造 不管次构造，在使用的时候 要考虑到次构造
data class Response2(var msg:String,var code:Int,var info:String)

fun main(){
    // toString 对比
    println(Response("success",200,"ok").toString())
    // 普通类 调用了Any toString(), Response@3764951d
    println(Response2("success",200,"ok").toString())
    // 数据类 调用了Any 被重写的toString() (msg=success, code=200, info=ok)

    // ==============
    // KT 的 == 相当于java的equals  === 相当于java地址值 比较
    println(Response("success",200,"ok") == Response("success",200,"ok"))
    // 推导结论是 true ,  实际结果却为 false ,调用了 Any 默认的 equals ,其对比的是 对象的地址值

    println(Response2("success",200,"ok") == Response2("success",200,"ok"))
    // 实际结果却为 true , 调用了 Any 重写后的 equals方法 ，其对比的是 对象的地址值
}