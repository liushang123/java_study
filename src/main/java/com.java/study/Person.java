package com.java.study;

import java.io.Serializable;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-13 上午11:11
 */
public class Person implements Serializable {
    private String name;
    private Email email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Person(String name, Email email) {
        this.name = name;
        this.email = email;
    }

    public Person(String name) {
        this.name = name;
    }

    Person() {

    }

    public boolean equals(Object object) {
        if (object instanceof Person) {
            Person p = (Person) object;
            if (p.getName() == null || name == null) {
                return false;
            } else {
                return name.equalsIgnoreCase(p.getName());
            }
        }
        return false;
    }
}
/*
 * public class Person { private int age; private int sex; //0：男，1：女 private
 * String name; private final int PRIME = 37; Person(int age ,int sex ,String
 * name){ this.age = age; this.sex = sex; this.name = name; }
 */
/**
 * 省略getter、setter方法
 **//*
    * 
    * @Override public int hashCode() {
    * System.out.println("调用hashCode方法..........."); int hashResult = 1;
    * hashResult = (hashResult + Integer.valueOf(age).hashCode() +
    * Integer.valueOf(sex).hashCode()) * PRIME; hashResult = PRIME * hashResult
    * + ((name == null) ? 0 : name.hashCode()); System.out.println("name:"+name
    * +" hashCode:" + hashResult); return hashResult; }
    */
/**
 * * 重写hashCode()
 *//*
   * 
   * public boolean equals(Object obj) {
   * System.out.println("调用equals方法..........."); if(obj == null){ return false;
   * } if(obj.getClass() != this.getClass()){ return false; } if(this == obj){
   * return true; } Person person = (Person) obj; if(getAge() != person.getAge()
   * || getSex()!= person.getSex()){ return false; } if(getName() != null){
   * if(!getName().equals(person.getName())){ return false; } } else if(person
   * != null){ return false; } return true; } }
   */
