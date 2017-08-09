package com.java.myIOTest;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-28 上午10:54
 */
public class UserseviceImpl implements UserService {
    public String getName(int id) {
        System.out.println("-------getName-------");
        return "Tom";
    }

    public Integer getAge(int id) {
        System.out.println("-------getAge---------");
        return 10;
    }
}
