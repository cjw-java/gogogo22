package com.heima.kind;

public class phone {

    //属性
    String brand;
    double price;

    //方法（行为）
    public void call(String name){
        System.out.println("正在给"+name+"打电话");
    }

    public void sendMessage(){
        System.out.println("正在发送短信");
    }

}
