package cn.xdf.studylib.b6

/**
 * author:fumm
 * Date : 2021/ 11/ 29 2:58 下午
 * Dec : Kotlin语言泛型转换实战
 **/
class KtBase_105<T>(val isMap: Boolean, val inputType: T) {
    // 模仿Rxjava map操作符，输入T类型 转换成R类型
    // takeIf 返回true 返回自己，false返回null
    inline fun <R> map(mapAction: (T) -> R) = mapAction(inputType).takeIf { isMap }
}

// 原始写法
//inline fun <I, T> map(isMap: Boolean, inputType: I, mapActionLambda: (I) -> T) {
//     if (isMap) mapActionLambda(inputType) else null
//}

// 简化后写法
fun <I, T> map(isMap: Boolean, inputType: I, mapActionLambda: (I) -> T) =
    if (isMap) mapActionLambda(inputType) else null


fun main() {
    val p = KtBase_105<Int>(true, 99)
    var r1: String? = p.map {
        "转换结果是：$it"
    }
    println(r1)

    // ----------
    val r2:String? = map(isMap = true, inputType = 99, mapActionLambda = {
        "map变换结果【$it】"
    })
    println("int 转 string $r2")
    val r3:Int? =map(isMap = true,inputType = "99"){
        it.toInt()
    }
    println("string 转 int $r3")
}