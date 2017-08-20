package com.java.leetCode;

/**
 * Created by mi on 17-8-15.
 */
public class DivideTwoIntegers_29 {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0 || dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long res = 0;
        while (a >= b) {
            for(long de = b,count = 1;a>=de;de<<=1,count<<=1) {
                a -=de;
                res += count;
            }
        }
        if (sign==-1) {
            res = -res;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        int a = divide(1, 1);
        System.out.println(a);
    }
}
