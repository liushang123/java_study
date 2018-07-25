package com.java.someTest.zhaohangxinyongka;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] time = new int[24];
        int max=0;
        for (int i = 0;i<n;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            for(int j = a-1;j<b-1;j++) {
                time[j]++;
                if (time[j] > max) {
                    max = time[j];
                }
            }
        }
        System.out.println(max);
    }
}
