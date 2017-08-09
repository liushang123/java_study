package com.java.leetCode;

/**
 * Created by mi on 17-8-7.
 */
public class UglyNumber_264 {
    public static int nthUglyNumber(int n) {
        int[] uglyNum = new int[n + 1];
        uglyNum[1] = 1;
        int pointer2= 1,pointer3=1,pointer5=1;
        for (int i = 2; i <= n; i++) {
            int min = Math.min(Math.min(uglyNum[pointer2] * 2, uglyNum[pointer3] * 3), uglyNum[pointer5] * 5);
            if (min == uglyNum[pointer2] * 2) pointer2++;
            if (min == uglyNum[pointer3] * 3) pointer3++;
            if (min == uglyNum[pointer5] * 5) pointer5++;
            uglyNum[i] = min;
        }
        return uglyNum[n];
    }



    public static void main(String[] main) {
        int a = nthUglyNumber(10);
        System.out.println(a);
    }

    boolean isUgly(int num) {
        for(int i = 2;i<6;i++)
            while(num%i == 0)
                num = num/i;

        return num == 1;
    }
}
