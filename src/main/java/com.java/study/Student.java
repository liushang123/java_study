package com.java.study;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-10 上午11:17
 */
public class Student implements Cloneable {
    String name;
    int age;
    Professor p;

    Student(String name, int age, Professor p) {
        this.name = name;
        this.age = age;
        this.p = p;
    }

    public Object clone() {
        Student o = null;
        try {
            o = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }

    public Object deepClone() {
        Student o = null;
        try {
            o = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.print(e.toString());
        }
        o.p = (Professor) p.deepClone();
        return o;
    }

    public static void main(String[] args) {
        Professor p = new Professor("wangwu", 50);
        Student s1 = new Student("zhangsan", 18, p);

        // deep copy
        Student s3 = (Student) s1.deepClone();
        s3.p.name = "deepCopy";
        System.out.println("学生s1的姓名: " + s1.name + "\n学生s1教授的名字: " + s1.p.name);

        // shallow copy
        Student s2 = (Student) s1.clone();
        s2.p.name = "lisi";
        s2.p.age = 30;
        s2.name = "maliu";
        System.out.println("学生s1的姓名: " + s1.name + "\n学生s1教授的名字: " + s1.p.name);

    }
}
