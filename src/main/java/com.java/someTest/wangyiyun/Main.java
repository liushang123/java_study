package com.java.someTest.wangyiyun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();

        int res = getSumProbabilityOfDices(n,x);
        double sum = Math.pow((double)6, (double)n);

        int div = getMaxDivide_ab(res, (int) sum);
        int m =res/div;
        int k = (int)sum/div;
        System.out.println(m+"/"+k);

    }

    public static int getSumProbabilityOfDices(int n,int x) {
        int pProbabilities[][] = new int[2][6*n+1];
        for(int i = 0; i < 6 * n + 1; ++i)
        {
            pProbabilities[0][i] = 0;
            pProbabilities[1][i] = 0;
        }
        int flag = 0;
        for (int i = 1; i <= 6; ++i)
            pProbabilities[flag][i] = 1;
        for (int k = 2; k <= n; ++k)
        {
            for (int i = k; i <= 6 * k; ++i)
            {
                pProbabilities[1 - flag][i] = 0;
                for(int j = 1; j <= i && j<= 6; ++j)
                    pProbabilities[1 - flag][i] += pProbabilities[flag][i - j];
            }

            flag = 1 - flag;
        }
        int res = 0;
        for(int i = n; i <= 6 * n; ++i)
        {
            if(i>=x){
                res = res + pProbabilities[flag][i];
            }
        }
        return res;
    }

    public static int getMaxDivide_ab(int a,int b){
        int value=1;
        int max;
        int min;
        if(a==b){
            return a;
        }
        if(a>b){
            max=a;
            min=b;
        }else{
            max=b;
            min=a;
        }
        for(int i=2;i<min;i++){
            if(0==max%i && 0==min%i){
                value=i;
            }
        }
        return value;
    }
}
