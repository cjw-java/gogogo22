package com.heima.kind;
//对象
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();//创建对象,静态的
        //赋值,变量名.方法名（值）
        gf.setName("小花");//一般的话可以通过name直接赋值
        gf.setAge(18);
        gf.setHeight(1.62);
        gf.setBeautiful(true);

        System.out.println(gf.getAge());
        System.out.println(gf.getName());
        System.out.println(gf.getHeight());
        System.out.println(gf.getBeautiful());



        gf.dance();
        gf.sing();
        gf.cook();

    }
}
