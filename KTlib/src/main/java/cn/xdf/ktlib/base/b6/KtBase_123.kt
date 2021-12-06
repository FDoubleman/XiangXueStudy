package cn.xdf.studylib.b6

/**
 * author:fumm
 * Date : 2021/ 12/ 01 2:29 下午
 * Dec : Kotlin语言 map、flatmap 学习
 **/
class KtBase_123 {

}

fun mapTest() {
    val list = listOf("java", "C", "python", "kotlin")
    // public inline fun <T, R> Iterable<T>.map(transform: (T) -> R): List<R>
    list.map {
        "语言类型$it"
    }.map {
        "$it ,我爱java!!!"
    }.map {
        "【$it】"
    }.map {
        println(it)
    }

    val listNew: List<String> = list.flatMap {
        println("[$it]")
        // 每次从list中取出一个元素，返回一个新的集合。  并把所有的集合添加到统一的集合中
        // 1、从list取出每一个元素 it
        // 2、每一个元素 对应创建一个新的集合 list
        // 3、将所有新的集合list ,统一添加到 总的集合lists 中(List<List<String>>).
        // 4、返回总的集合
        listOf("我爱 $it!"," $it 很优秀")
    }
    println(listNew)
    // [我爱 java!,  java 很优秀,
    // 我爱 C!,  C 很优秀,
    // 我爱 python!,  python 很优秀,
    // 我爱 kotlin!,  kotlin 很优秀]
}

fun main() {
    mapTest()
}