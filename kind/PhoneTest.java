package com.heima.kind;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建手机对象
        phone p = new phone();
        // 给手机属性赋值
        p.brand = "华为";
        p.price = 5999;

        //获取手机属性
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机方法
        p.call("张三");
        p.sendMessage();


        phone p2 = new phone();
        p2.brand = "苹果";
        p2.price = 9999;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.call("王五");
        p2.sendMessage();


    }
}
