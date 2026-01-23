package com.heima.kind;

public class Merchant {
    private String name;
    private int price;
    private int number;
    private String id;

    public Merchant(String name, int price, int number, String id) {//构造方法,接收参数，后续通过赋值成员变量进行类方法调用
        this.name = name;
        this.price = price;
        this.number = number;
        this.id = id;
    }

    public Merchant() {//空参数构造方法，避免创建对象时，属性为null报错，当pass使用
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            this.price = -price;
            return;

        } else if (price==0) {
            System.out.println("价格不能为0");
            return;
        }
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
