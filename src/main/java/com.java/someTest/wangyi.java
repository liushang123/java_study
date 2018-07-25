package com.java.someTest;

import java.util.LinkedList;
import java.util.Scanner;

public class wangyi {
    public static void main(String[] args) {

        LinkedList<String> st = new LinkedList<String>();
        LinkedList<Object> rs = new LinkedList<Object>();

        Object ob = new Object();

        ob = st;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0;i<t;i++) {
            int n = in.nextInt();
            int tem = 0;
            int cou2 = 0;
            int cou4 = 0;
            for(int j = 0;j<n;j++) {
                tem = in.nextInt();
                if (tem % 4 == 0) {
                    cou4++;
                } else if(tem % 2 == 0){
                        cou2++;
                }


            }
            if (cou4 * 2 >= n-1 || cou4 * 2 + cou2 >= n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
