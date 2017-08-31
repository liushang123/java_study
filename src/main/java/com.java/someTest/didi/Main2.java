package com.java.someTest.didi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();

        String[] inteStr =str.split(" ");
        int len = inteStr.length;
        int[] num = new int[len];
        for(int i = 0;i<len;i++) {
            num[i] = Integer.parseInt(inteStr[i]);
        }

        getNumber(len-k,num,0,len-1);



    }

    public static int adjustArray(int[] a, int low, int high) {
        int i = low, j=high;
        int key = a[low];
        while(i<j){
            while(i<j && a[j] >=key)
                j--;
            a[i] = a[j];
            while(i<j && a[i]<=key)
                i++;
            a[j] = a[i];

        }
        a[j] = key;
        return j;
    }

    public static void getNumber(int k,int[] data,int low,int high)
    {
        int index=adjustArray(data,low,high);
        if(index==k)
        {
            System.out.println(data[index]);
        }
        else if(index>k)
        {
            getNumber(k,data,low,index-1);
        }
        else
        {
            getNumber(k,data,index+1,high);
        }
    }

    public static int findK(int[] a, int low, int high,int k) {

        if (low < high) {
            int mid = adjustArray(a, low, high);
            if (mid == k) {
                return a[mid];
            }
            else if(mid>k)
                findK(a, low, mid - 1,k);
            else
                findK(a, mid + 1, high,k);
        }
        return a[low];
    }
}
