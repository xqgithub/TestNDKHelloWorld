package com.first.testndkhelloworld;

/**
 * Created by admin on 2018/6/20.
 */

public class HelloJni {

    static {
        System.loadLibrary("hello");//加载so文件，不要带上前缀lib和后缀.so
    }

    public native int sayHello(int a);//定义本地方法接口，这个方法类似虚方法，实现是用c或者c++实现的

}
