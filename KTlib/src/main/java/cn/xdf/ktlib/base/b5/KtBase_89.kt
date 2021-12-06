package cn.xdf.studylib.b5

/**
 * author:fumm
 * Date : 2021/ 11/ 26 10:01 上午
 * Dec : kontlin 语言伴生对象
 **/
class KtBase_89 {

    /**
     *    private static final String info = "fmm";
          public static final KtBase_89.Companion Companion =
                new KtBase_89.Companion((DefaultConstructorMarker)null);
     */
    companion object{
        val info ="fmm"
        fun showInfo(){
            println("显示 $info")
        }
    }
}

// 伴生对象的由来：在Kt是没有java的 static静态，伴生很大程度上和java的static 静态差不多
// 无论 KtBase_89() 构建多少次我们的伴生对象，只有一次加载
// 无论 KtBase_89.showInfo() 调用多少次 伴生对象 只有一次加载
// 伴生对象只会初始化一次
fun main(){
    println(KtBase_89.info)
    KtBase_89.showInfo()
}