package com.java.someTest.toutiao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void sort(int[][] ob, final int[] order) {
        Arrays.sort(ob, new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                int[] one = (int[]) o1;
                int[] two = (int[]) o2;
                for (int i = 0; i < order.length; i++) {
                    int k = order[i];
                    if (one[k] > two[k]) {
                        return 1;
                    } else if (one[k] < two[k]) {
                        return -1;
                    } else {
                        continue;  //如果按一条件比较结果相等，就使用第二个条件进行比较。
                    }
                }
                return 0;
            }
        });
    }
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[][] P = new int[N][2];
        for(int i = 0;i<N;i++) {
            P[i][0] = cin.nextInt();
            P[i][1] = cin.nextInt();
        }
        int[][] res = new int[N][2];
        int count=0;
        for(int i=0;i<N;i++) {
            int j = 0;
            for(j=0;j!=i&&j<N;j++) {
                if (P[i][0] <= P[j][0] && P[i][1] <= P[j][1]) {
                    break;
                }
            }
            if (j == N || (i==N && j==N-1)) {
                res[count][0] = P[i][0];
                res[count][1] = P[i][1];
                count++;
            }
        }
        sort(res,new int[]{0,1});
        for (int i = 0; i < N; i++) {
            if (!(res[i][0] == 0 && res[i][1] == 0)) {
                System.out.println(P[i][0] + " " + P[i][1]);
            }
        }
    }
}
