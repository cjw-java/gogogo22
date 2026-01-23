package com.heima.kind;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    private String wugong;

    String[] boyfaces = {"a", "b", "c", "d", "e"};
    String[] girlfaces = {"a1", "b1", "c1", "d1", "e1"};
    String[] atkwogong = {"%s使用降龙十八掌%s",  "%s使用独孤九剑%s", "%s使用乾坤大挪移%s",
            "%s使用六脉神剑%s",  "%s使用凌波微步%s", "%s使用打狗棒法%s", "%s使用伏魔掌"};
    String[] defwogong = { "使用易筋经", "北冥神功", "使用九阳神功",};

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);//设置脸型，通过gender判断
    }

    public Role() {
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {//随机生成,通过gender判断，所以传gender
        Random r = new Random();
        if (gender == '男') {
          int imdex = r.nextInt(boyfaces.length);
          this.face = boyfaces[imdex];
        } else if (gender == '女'){
            int imdex = r.nextInt(girlfaces.length);
            this.face = girlfaces[imdex];
        }else {
           this.face = "未知";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;//this：当前对象
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getWogong() {
        return wugong;
    }

    public void setWogong(String[] wogong) {
        this.wugong = wugong;
    }

    //定义一个方法去攻击别人
    //思考：谁攻击谁？
    //方法调用者攻击数据

    public void recover(Role role) {
        Random random = new Random();
        int index = random.nextInt(defwogong.length);
        int re = random.nextInt(10) + 1;
        int remainblood = role.blood + re;
        if(remainblood > 100) remainblood = 100;
        System.out.println(this.name+"使用"+defwogong[index]+"回复了"+re+"血！"+
                "剩余血量："+ remainblood);
    }





    public void attack(Role role) {
        Random random = new Random();

        int index = random.nextInt(atkwogong.length);
        String kungfu = atkwogong[index];
        System.out.printf(kungfu, this.name,role.name);

        int attack = random.nextInt(10) + 1;

        int reaminblood = role.blood - attack;//剩余血量

        reaminblood = reaminblood < 0 ? 0 : reaminblood;//防止负数

        role.setBlood(reaminblood);//设置剩余血量
        System.out.println(this.name + "攻击了" + role.name + "，攻击力为：" + attack +
                ",剩余血量为：" + reaminblood);
    }

}
