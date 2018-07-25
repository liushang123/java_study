package com.java.someTest.jingdong;

import java.util.Scanner;

public class Main {
    static int[] ans = new int[1200001];
    public static int deepfs(int t) {
        if(ans[t]>0)
            return ans[t];
        ans[t] = 0;
        int[] a = new int[22];
        int len = 0;
        int tmp = t;
        while (t>0) {
            a[++len] = t%2;
            t/=2;
        }
        for(int i = len;i>0;--i) {
            if(a[i] == 1)
                continue;
            if (i != len-1 && a[len-1] != 1)
                continue;
            int p = 0;
            for (int j=len-1;j>0;--j)
                if (i != j)
                    p = p*2+a[j];
            ans[tmp] += deepfs(p);
        }
        return ans[tmp];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        int a = 0;
        for (int i=0;i<len;++i)
            a = a*2 + (str.charAt(i) == '(' ? 1 : 0);
        for(int i = 0;i<len;i++) {
            ans[i] = 0;
        }
        ans[0] = 1;

        System.out.println(deepfs(a));

    }
}
