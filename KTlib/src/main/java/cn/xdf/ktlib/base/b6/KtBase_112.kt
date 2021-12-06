package cn.xdf.studylib.b6

/**
 * author:fumm
 * Date : 2021/ 11/ 30 11:01 上午
 * Dec : TODO
 **/

data class ObjClass1(val name: String, val age: Int)
data class ObjClass2(val name: String, val age: Int)
data class ObjClass3(val name: String, val age: Int)

class KtBase_112 {

    // 默认随机输出一个对象，如果次对象和用户指定的对象不一致，则返回 备用对象
    // inline fun<reified T> :
   inline fun<reified T> randomOrDefault(defaultLambdaAction:()->T) :T?{
        val list: List<Any> = listOf(
            ObjClass1("obj1 tom", 18),
            ObjClass2("obj2 jerry", 20),
            ObjClass3("obj3 光头强", 28)
        )
        // shuffled:返回一个新列表，该列表的元素被随机打乱。
        val randomObj = list.shuffled().first()
        println("随机产生的幸运儿：${randomObj}")

        // 1、 randomObj.takeIf { it is T } 返回 null or T的类型
        // 2、 randomObj.takeIf { it is T } as T?  ，返回 null or T的类型
        // 3、 randomObj.takeIf { it is T } as T?  ，当返回 null 执行 ?:后面的并返回
        return randomObj.takeIf { it is T } as T? ?:defaultLambdaAction()
    }
}

fun main() {
    val p = KtBase_112()
    p.randomOrDefault<ObjClass1> {
        println("由于随机产生的类型 不是 指定的 ObjClass1 所以使用备用的")
        ObjClass1("备用 obj1 tom", 18)
    }
}