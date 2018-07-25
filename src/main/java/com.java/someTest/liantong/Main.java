package com.java.someTest.liantong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new LinkedList<>();
        for(int i=1;i<=n;i++) {
            list.add(i);
        }
        int count = 0;
        while (list.size() > 0) {
            count ++;
            if(count%3== 0){

            }
        }*/



        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        List<Integer> group=new ArrayList<Integer>();
        //1、给数组列表初始化数据
        for(int i=1;i<=n;i++){
            group.add(i);
        }
        int number=1;
        for(int i=0;i<n;i++){
            if(number==3){
                group.remove(i);
                i--;
                n--;
                number=0;
            }
            number++;
            if(i==n-1){
                i=-1;
            }
            if(n==1){
                break;
            }

        }
        System.out.println(group.get(0));
    }
}
