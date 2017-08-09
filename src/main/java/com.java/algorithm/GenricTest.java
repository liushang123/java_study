package com.java.algorithm;

/**
 * Created by mi on 17-7-4.
 */
public class GenricTest {
    public static void main(String[] args) {
        Box<String> name = new Box<String>("corn");
        Box<Integer> age = new Box<Integer>(712);
        Box<Number> number = new Box<Number>(314);

        getData(name);
        getData(age);
        getData(number);

        //getUpperNumberData(name); //error
        getUpperNumberData(age);
        getUpperNumberData(number);

        String[] strings = {"aa", "bb", "cc"};
        String middle = name.getMiddle(strings);

        System.out.println(middle);
    }

    public static void getData(Box<?> data) {
        System.out.println("data: " + data.getData());
    }

    public static void getUpperNumberData(Box<? extends Number> data) {
        System.out.println("data: " + data.getData());
    }
}

class Box<T>{
    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public <E> E getMiddle(E[] a) {
        return a[a.length / 2];
    }
}

