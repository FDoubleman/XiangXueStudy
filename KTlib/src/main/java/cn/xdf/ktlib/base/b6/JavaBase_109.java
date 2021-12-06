package cn.xdf.ktlib.base.b6;

import java.util.ArrayList;
import java.util.List;

/**
 * author:fumm
 * Date : 2021/ 11/ 30 10:18 上午
 * Dec : TODO
 **/
class JavaBase_109 {

    public static void main(String[] args) {
        List<CharSequence> list = new ArrayList<CharSequence>();
        // 泛型默认情况下是：泛型的子类对象 是不可以 赋值给 泛型的父类对象
        // 泛型默认情况下是：泛型具体处的子类对象  是不可以 赋值给 泛型声明出的父类对象
        // CharSequence ：父类    String:子类
        // List<CharSequence> list2 = new ArrayList<String>();

        // 解决方法：---------------------
        // ? extends CharSequence 就相当于KT里面的out
        // out:泛型具体处的子类对象  可以赋值给  泛型声明出的父类对象
        List<? extends CharSequence> list2 = new ArrayList<String>();

        // 协变：父类 泛型声明出 可以接收  子类泛型具体处
    }
}
