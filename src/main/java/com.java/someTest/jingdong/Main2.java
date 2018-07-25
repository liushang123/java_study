package com.java.someTest.jingdong;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long res = 1;
        for(int k = 2 ;k <=n;k++){
            for(int i = 1;i<=n;i++){
                int c = i;
                for(int j = 1;j<=n&&c<=n;j++) {
                    if (n % j == 0) {
                        res++;
                        if (res >= 1000000007) {
                            res = 0;
                        }
                    }
                    c *=i;
                }
                res++;
                if (res >= 1000000007) {
                    res = 0;
                }
            }
        }
        System.out.println(res);

    }
}
