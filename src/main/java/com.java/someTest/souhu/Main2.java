package com.java.someTest.souhu;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[6];
        int count = 0;
        for(int i=0;i<6;i++) {
            a[i] = in.nextInt();
            count += a[i];
        }
        while (count > 0) {
            int sum = 0;
            sum += a[5];
            if (a[4] > 0) {
                sum += a[4];
                if (a[0] > a[4] * 11) {
                    a[0] = a[0] - a[4] * 11;
                } else {
                    a[0] = 0;
                }

            }
            if (a[3] > 0) {
                sum += a[4];
                if (a[1] > a[3] * 5) {
                    a[1] = a[1] - a[3] * 5;
                } else {
                    a[1]=0;
                    if (a[0] > (20 * a[3] - 4 * a[1])) {
                        a[0] = a[0] - (20 * a[3] - 4 * a[1]);
                    } else {
                        a[0] = 0;
                    }
                }
            }
            if (a[2] > 0) {
                sum += a[2] / 4;
                if (a[2] % 4 > 0) {
                    sum += 1;
                    if (a[2] % 4 == 1) {
                        a[1] = a[1]-5;
                        a[0] = a[0]-7;
                    } else if (a[2] % 4 == 2) {
                        a[1] = a[1] - 3;
                        a[0] = a[0] - 6;
                    } else {
                        a[1] = a[1] - 1;
                        a[0] = a[0] - 5;
                    }
                }
            }
            if (a[1] > 0) {
                sum += a[1] / 9;
                if (a[1] % 9 > 0) {
                    sum++;
                    a[0] = a[0] - (36 - (a[1] % 9) * 4);
                }
            }
            if (a[0] > 0) {
                sum += a[0] / 36;
                if (a[0] % 36 > 0) {
                    sum++;
                }
            }
            System.out.print(sum);
            count = 0;
            for(int i=0;i<6;i++) {
                a[i] = in.nextInt();
                count += a[i];
            }
            if (count > 0) {
                System.out.println();
            }
        }
    }
}
