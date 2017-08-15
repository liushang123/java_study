package com.java.leetCode;

/**
 * Created by mi on 17-8-15.
 */
public class DivideTwoIntegers_29 {
    public static int divide(int dividend, int divisor) {
        int res = 0;
        while (dividend > 0) {
            dividend -= divisor;
            res++;
        }
        if (dividend < 0) {
            res--;
        }

        return res;
    }

    public static void main(String[] args) {
        int a = divide(7, 3);
        System.out.println(a);
    }
}
