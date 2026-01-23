package com.heima.kind;

import java.util.Scanner;

public class MerchantTest {
    public static void main(String[] args) {
        Merchant[] arr = new Merchant[3];


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Merchant m = new Merchant();
            System.out.println("请输入商品名称：");
            String name = sc.next();
            m.setName(name);
            System.out.println("请输入商品价格：");
            int price = sc.nextInt();
            m.setPrice(price);
            System.out.println("请输入商品编号：");
            String id = sc.next();
            m.setId(id);
            //把汽车对象添加到数组当中
            arr[i] = m;
        }
        for (int i = 0; i < arr.length; i++) {
            Merchant m = arr[i];
            System.out.println(m.getName() + "汽车品牌:" +"汽车价格："+ m.getPrice() + "汽车编号:" + m.getId());
        }


    }
}
