package com.heima.kind;
//类
public class GirlFriend {
    private String name;
    private int age;
    private double height;
    private boolean isBeautiful;

    //private：封装，保证安全性
    //针对每一个属性，创建一个对应的get和set方法
    //set: 设置属性值
    //get: 获取属性值
    //封装：把属性私有化，通过方法来访问属性
    //this：当前对象

    public void setName(String name) {//参数n，局部变量，要传入判断
     //局部变量表示测试类中传递方法的数据（name）
        // 此时是name赋值给等号左边
        // this.name表示成员位置的name
        this.name = name;
        //就是通过name赋值给this.name，用string接收name
        //再赋值给this.name,
    }
    //this,跳过局部变量，直接跳到成员变量
    //无this，先去局部变量，没有则跳到成员变量





    //一set一get配合一个属性
    public String getName() {//返回值,不需要参数

        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;//赋值给成员变量，
        } else {
            System.out.println("你输入的age有误");
        }
    }

    public int getAge() {

        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setBeautiful(boolean isBeautiful) {
        this.isBeautiful = isBeautiful;
    }

    public boolean getBeautiful() {
        return isBeautiful;
    }


    public void dance() {
        System.out.println(name + "在跳舞");
    }

    public void sing() {
        System.out.println(name + "在唱歌");
    }

    public void cook() {
        System.out.println(name + "在做饭");
    }

}
