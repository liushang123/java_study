package com.java.someTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = cin.nextInt();
        }
        int Q = cin.nextInt();
        int[] q = new int[Q];
        for(int j = 0;j<Q;j++){
            q[j] = cin.nextInt();
        }
        for(int j = 0;j<Q;j++) {
            int num = 0;
            int index = 0;
            while (q[j] > num) {
                num += a[index];
                index++;
            }
            System.out.println(index);
        }

        int[] b = new int[n+1];
        b[0] = 0;
        for(int k = 1;k<n+1;k++){
            b[k] = b[k-1]+a[k-1];
        }
        for(int j = 0;j<Q;j++){
            int an = binSearch(q[j],b);
            System.out.println(an);
        }
    }
    public static int binSearch(int k,int[] b){
        int low = 0;
        int high = b.length-1;
        while(low <= high) {
            int middle = (low + high)/2+1;
            if(k >b[middle-1] && k<=b[middle]) {
                return middle;
            }else if(k <=b[middle-1]) {
                high = middle - 1;
            }else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
