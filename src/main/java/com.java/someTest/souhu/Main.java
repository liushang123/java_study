package com.java.someTest.souhu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[m];
        for(int i=0;i<m;i++) {
            a[i] = in.nextInt();
        }
        int[] res = new int[n*2];
        int cou = 0;
        res[0] = a[0];
        int index = 0;
        while (cou < n) {
            for(int i=0;i<res[index];i++) {
                res[cou] = a[index % m];
                cou++;
            }
            if (res[index] == 0) {
                res[index] = a[index % m];

                continue;
            }
            index++;
        }
        for(int j=0;j<n-1;j++) {
            System.out.println(res[j]);
        }
        System.out.print(res[n-1]);
    }
}
