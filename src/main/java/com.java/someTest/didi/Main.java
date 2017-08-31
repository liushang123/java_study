package com.java.someTest.didi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        String[] inteStr = str.split(" ");
        int len = inteStr.length;
        int max = Integer.valueOf(inteStr[0]);
        int  curSum = 0;
        for(int i = 0;i<len;i++) {
            if (curSum <= 0) {
                curSum = Integer.valueOf(inteStr[i]);
            }
            else
                curSum += Integer.valueOf(inteStr[i]);
            if (curSum > max) {
                max = curSum;
            }
        }
        System.out.println(max);


    }

}
