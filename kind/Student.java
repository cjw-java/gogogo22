package com.heima.kind;

public class Student {
    private String name;//私有属性
    private int age;

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
