package cn.xdf.studylib.b6

/**
 * author:fumm
 * Date : 2021/ 11/ 29 4:03 下午
 * Dec : Kotlin语言的vararg关键字(动态参数)
 **/
class KtBase_107<T>(vararg objects: T, var isMap: Boolean) {

    // 1.objectArray:Array<out T>
    // out 这里的T 只能被读取 不能修改
    val objectArray: Array<out T> = objects

    // 2.showObj(index)  takeIf 可能返回为空
    fun showObj(index: Int): Any? = objectArray[index].takeIf { isMap }

    // 3.mapObj(index,变换lambda)
    fun <O> mapObj(index: Int, mapAction: (T?) -> O) =
        // objectArray[index].takeIf { isMap } 可能为空 因此使用T?
        mapAction(objectArray[index].takeIf { isMap })
}

fun main() {
    // p的类型 真正的类型：{Comparable<*>&java.io.Serializable}
    //  由于不允许我们这么写 KtBase_107<{Comparable<*>&java.io.Serializable}> 所以使用Any?代替
    val p: KtBase_107<Any?> = KtBase_107("tom", false, 100, 1.01f, 10.23, 'D', isMap = true)
    // 取值类型为Any?
    val r: Any? = p.showObj(0)
    println(r)
    // 转换
    val r2 = p.mapObj(0, mapAction = {
        // it = objectArray[index] 或者 null
        it.toString().length
    })
    println(r2)

}