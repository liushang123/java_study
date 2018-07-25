package com.java.someTest.meituan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int[] a = new int[n];
        for(int i = 0;i<n;i++) {
            a[i] = in.nextInt();
            sum+=a[i];
        }
        int k = in.nextInt();

        int res = solve(sum, k, 0, n - 1, a);
        System.out.println(res);

    }

    public static int solve(int sum,int k,int low,int high,int[] a) {
        if (low <= high) {
            if (sum % k == 0) {
                return high-low+1;
            }else {
                if ((sum - a[low]) % k == 0 || (sum - a[high]) % k == 0) {
                    return high - low;
                } else {
                    int tem1 = solve(sum - a[low] , k, low + 1, high, a);
                    int tem2 = solve(sum - a[high] , k, low, high - 1, a);
                    return tem1>tem2? tem1:tem2;
                }
            }
        }
        return 0;
    }
}
