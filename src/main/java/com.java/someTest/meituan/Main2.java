package com.java.someTest.meituan;
import java.util.Scanner;

public class Main2 {
    public static void check(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int tmp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            tmp[i]=sc.nextInt();
        }
        int max=tmp[0];
        int index=0;
        int maxNum=1;
        for(int i=1;i<n;i++)
        {
            if(max<tmp[i])
            {
                max=tmp[i];
                index=i;
                maxNum=1;
            }
            else if(max==tmp[i])
            {
                maxNum++;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i!=index)
                sum+=tmp[i];
        }
        if(sum>=max||maxNum>=2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static void main(String[] args) {
        check();
    }

}
