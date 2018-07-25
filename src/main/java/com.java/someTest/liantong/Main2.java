package com.java.someTest.liantong;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        boolean flag = false;
        int count = 0;
        int num = 0;
        int[] res = new int[10000];
        res[0] = 1;
        while(count < 10000)
        {
            for(int i = 2; i <= 10000; i++)
            {
                int j = 2;
                for(j = 2; j <= Math.sqrt((double)i); j++)
                {
                    if(i % j == 0)
                        break;
                }
                if(j >  Math.sqrt((double)i))
                {
                    count++;
                    num = i;

                    if(count == n)
                        break;
                }
            }
        }
        System.out.println(num);
    }
}
