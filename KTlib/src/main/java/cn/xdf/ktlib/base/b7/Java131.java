package cn.xdf.ktlib.base.b7;

import cn.xdf.studylib.b7.Student;
import kotlin.jvm.JvmField;

/**
 * author:fumm
 * Date : 2021/ 12/ 02 2:48 下午
 * Dec : TODO
 **/
class Java131 {
    public static void main(String[] args) {
        Student s = new Student();
        // s.getList();
        // 如果不想通过 get的方式获取kotlin的属性
        // 需要在该属性上添加
//        @JvmField
//        val list = listOf<String>("tom","jerry","luna")
        // s.list

        s.showStudent("张三",10);// java默认无法使用Kotlin的默认参数
        s.toast("李四");// 对Koltin方法使用 @JvmOverloads 注解，能使用kotlin的默认参数功能
    }
}
