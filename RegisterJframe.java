package com.heima.ui;

import javax.swing.*;

public class RegisterJframe extends JFrame {
    //创建注册界面
    public RegisterJframe() {
        this.setSize(488, 500);
        this.setVisible(true);
    //默认关闭模式
        this.setDefaultCloseOperation(3);
        //居中
        this.setLocationRelativeTo(null);
        //置顶
        this.setAlwaysOnTop(true);
        //禁止最大化
        this.setTitle("注册界面");
    }
}
