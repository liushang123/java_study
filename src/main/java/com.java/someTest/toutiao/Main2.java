package com.java.someTest.toutiao;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        int max = 0;

        boolean flag = true;
        for(int i = 0;i<n;i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            if (a[i] * sum > max) {
                max = a[i] * sum;
            }
            sum = sum - a[i];

        }
        System.out.println(max);

    }
}
