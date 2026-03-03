package com.heima.ui;

import javax.swing.*;

public class LoginJframe extends JFrame {//JFrame是所有方法的基类，所以作为父类继承
    //创建登录界面,进行初始化
    public LoginJframe() {
        this.setSize(488, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setTitle("登录界面");
    }

}
