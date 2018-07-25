package com.java.someTest.liantong;

import java.util.Scanner;
public class Main3 {
    public static int max=Integer.MAX_VALUE;
    public static void swap(int[] str, int i, int j)
    {
        if(i==j)
            return;
        str[i]=str[i]^str[j];
        str[j]=str[i]^str[j];
        str[i]=str[i]^str[j];
    }

    public static int compute(int[] str,int left[],int right[])
    {
        int temp=0;
        int tempL[]=new int[left.length];
        int tempR[]=new int[right.length];
        for(int i=0;i<left.length;i++)
        {
            tempL[i]=left[i];
            tempR[i]=right[i];
        }
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<tempL.length;j++)
            {
                if(tempL[j]-1==i)
                {
                    temp+=str[tempR[j]-1];
                    tempL[j]=-1;
                    tempR[j]=-1;
                }
            }

            for(int j=0;j<tempR.length;j++)
            {
                if(tempR[j]-1==i)
                {
                    temp+=str[tempL[j]-1];
                    tempL[j]=-1;
                    tempR[j]=-1;
                }
            }
        }
        return temp;
    }

    public static void arrange(int[] str, int st, int len,int left[],int right[])
    {
        if (st == len - 1)
        {
            int total=compute(str,left,right);
            if(max>total)
                max=total;
        }
        else
        {
            for (int i = st; i < len; i ++)
            {
                swap(str, st, i);
                arrange(str, st + 1, len,left,right);
                swap(str, st, i);
            }
        }

    }


    public static void main(String[] args) {
		         Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int str[]=new int[m];
        for(int i=0;i<m;i++)
            str[i]=in.nextInt();
        int left[]=new int[n];
        int right[]=new int[n];
        for(int j=0;j<n;j++)
        {
            left[j]=in.nextInt();
            right[j]=in.nextInt();
        }
        arrange(str, 0, str.length,left,right);
        System.out.println(max);
    }




}
