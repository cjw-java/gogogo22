package com.heima.kind;

public class user {
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    public user() {//空参数构造方法，避免创建对象时，属性为null报错，当pass使用
    }

    public user(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    //如果要调用方法，必须创建对象，创建对象时，必须在主方法中调用构造方法，之后才能调用方法
    static void main() {
        user ojx1 = new user();
        ojx1.username = "ojx1";//赋值给成员变量，也可以用set方法，目的相同：封装
        System.out.println(ojx1.getUsername());//调用方法
        user ojx2 = ojx1;//引用类型
        ojx2.username = "ojx2";//改变ojx2,修改了并覆盖了ojx1
        System.out.println(ojx1.getUsername());
        System.out.println(ojx2.getUsername());
    }

}
