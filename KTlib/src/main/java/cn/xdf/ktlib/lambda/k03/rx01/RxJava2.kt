package cn.xdf.ktlib.lambda.k03.rx01

/**
 * author:fumm
 * Date : 2021/ 12/ 08 1:58 下午
 * Dec : TODO
 **/
fun main() {

    create {
        90
        false
        90
    }.map {
        "tom $it"
    }.map {
        "[$it]"
    }.consumer{
        println("消费 $it")
    }


}

private inline fun<T> T.consumer(action:(T)->Unit){
    action(this)
}

private inline fun <T> create(action: () -> T):T {
    return action()
}

private inline fun<I,O> I.map(action: (I) -> O):O{
    return action(this)
}