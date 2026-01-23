package com.heima.kind;

public class GameTest {
    public static void main(String[] args) {
        Role r = new Role("xiao", 100, '男');
        Role r1 = new Role("dio",100, '女');

        System.out.println(r.getName() + ":" + r.getFace());
        System.out.println(r1.getName() + ":" + r1.getFace());


        System.out.println("========================");

        while (true){
            r.attack(r1);//谁调用谁攻击
            if(r1.getBlood() <= 0) {
                System.out.println(r.getName() + " 杀死了 " + r1.getName());
                break;
            }
            r1.attack(r);
            if(r.getBlood() <= 0) {
                System.out.println(r1.getName() + " 杀死了 " + r.getName());
                break;
            }
            r.recover(r);
            if(r.getBlood() >= 100) {
                System.out.println(r.getName() + " 恢复血量");
                break;
            }
            r1.recover(r1);
            if(r1.getBlood() >= 100) {
                System.out.println(r1.getName() + " 恢复血量");
            }
        }

    }
}
