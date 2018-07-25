package com.java.someTest.meituan;

import java.util.Scanner;

public class Main3 {
    public static int check(int numA,int lenA,int numB,int lenB)
    {
        int res = 0;
        if((numA*Math.pow(10,lenB)+numB)%7==0)
            res++;
        if((numB*Math.pow(10,lenA)+numA)%7==0)
            res++;
        return res;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int b[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            b[i] = String.valueOf(a[i]).length();
            a[i] = a[i]%7;
        }
        int count = 0;
        for(int i = 0;i<n-1;++i) {
            for(int j = i+1;j<n;j++) {
                count += check(a[i],b[i],a[j],b[j]);
            }
        }
        System.out.println(count);

    }

}

