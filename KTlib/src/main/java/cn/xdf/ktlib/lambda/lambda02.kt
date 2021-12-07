package cn.xdf.ktlib.lambda

/**
 * author:fumm
 * Date : 2021/ 12/ 06 2:20 下午
 * Dec : TODO
 **/


fun test(): Int {
    return 99
}

val pp = { str: String ->
    str.length
}

fun main() {
    show(10, {
        println(it)
        "da"
    })
    show(10) {
        println(it)
        "fsd"
    }
}


fun show(num: Int, lambda: (Int) -> String) {
    lambda(num)
    lambda.invoke(num)

    // fun(num: Int, num2: Int)）函数 ------  返回 (Int, Int) -> String函数
    // fun22 就是一个 函数：Function2<java.lang.Integer, java.lang.Integer, java.lang.String>
    val fun22 = fun(num: Int, num2: Int): (Int, Int) -> String = { n1, n2 ->
        "${n1 * n2}"
    }
    println(fun22(12, 10))

    var p: (String) -> (String) -> (Boolean) -> (Int) -> (String) -> Int =
        {
            {
                {
                    {
                        {
                            90
                        }
                    }
                }
            }
        }
    println(p("fmm")("dd")(false)(10)("opp"))
}