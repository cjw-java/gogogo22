package com.heima.ui;

import javax.swing.*;

public class GameJframe extends JFrame {
    //游戏界面，进行初始化
    public GameJframe() {
        initJframe();

        initJMenuBar();

        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }

    private void initJMenuBar() {
        //创建菜单栏（初始化）
        JMenuBar jMenuBar = new JMenuBar();
        JMenu j1 = new JMenu("帮助");
        JMenu j2 = new JMenu("关于我们");

        //创建菜单项
        JMenuItem j3 = new JMenuItem("重新登录");
        JMenuItem j4 = new JMenuItem("注册");
        JMenuItem j5 = new JMenuItem("关闭游戏");
        JMenuItem j6 = new JMenuItem("公众号");

        //添加菜单项
        j1.add(j3);
        j1.add(j4);
        j1.add(j5);
        j2.add(j6);

        //添加菜单
        jMenuBar.add(j1);
        jMenuBar.add(j2);

        this.setJMenuBar(jMenuBar);
    }

    private void initJframe() {
        //设置界面宽高
        this.setSize(600, 600);
        //默认关闭模式
        this.setDefaultCloseOperation(3);
        //界面居中
        this.setLocationRelativeTo(null);
        //界面置顶
        this.setAlwaysOnTop(true);
        //界面标题
        this.setTitle("拼图游戏 v1.0");
    }

}
