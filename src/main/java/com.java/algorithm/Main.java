package com.java.algorithm;

import java.util.Scanner;

public class Main{
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

    public static void quick_sort(int[] a, int low, int high) {
        if (low < high) {
            int mid = adjustArray(a, low, high);
            quick_sort(a, low, mid - 1);
            quick_sort(a, mid + 1, high);
        }
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //int[] input = new int[] { 12, 1, 50, 8, 9, 8, 6, 7, 10, 3 };
        int low = 0;
        //int high = input.length-1;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] integerArray = str.split(",");
        int len = integerArray.length;
        int[] input = new int[len];
        for(int i =0;i<len;i++) {
            input[i] = Integer.parseInt(integerArray[i]);
        }

        quick_sort(input,low,len-1);
        printArray(input);
    }
}
