package com.heima.ui;

public class APP {//启动类
    static void main() {
        new LoginJframe();
        new RegisterJframe();
        new GameJframe();
        //使用继承进行改写，把登录界面，注册界面，游戏界面都分开，创建一个启动类，启动程序。
        //避免代码臃肿，后期维护不便


    }
}
