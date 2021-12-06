@file:JvmName("Stu")
package cn.xdf.studylib.b7

/**
 * author:fumm
 * Date : 2021/ 12/ 02 2:00 下午
 * Dec : 注解@JvmName与Kotlin
 **/

fun show(str: String) = println(str)

fun main() {
}

// 小结：上面的代码 其实会转换成 下面的代码。直接使用 KtBase_131Kt.show("Tom")
//      KtBase_131Kt 类的名字不友好。可以通过
//      在 package 上面 添加  @file:JvmName("Stu")
//      就会将 KtBase_131Kt 的类名 转换长 Stu
// 注意：@file:JvmName("Stu") 必须写在包名的外面
//public final class KtBase_131Kt {
//    public static final void show(@NotNull String str) {
//        Intrinsics.checkNotNullParameter(str, "str");
//        System.out.println(str);
//    }
//
//    public static final void main() {
//    }
//
//    // $FF: synthetic method
//    public static void main(String[] var0) {
//        main();
//    }
//}