package com.java.leetCode;

public class CountAndSay_38 {
    public static String countAndSay(int n) {
        String res = "1";
        if (n == 1) {
            return "1";
        }
        for(int i = 1;i<n;i++) {
            StringBuilder sb = new StringBuilder();
            char[] ch = res.toCharArray();
            int len = ch.length;
            if (len == 1) {
                res = "11";
                continue;
            }
            int j = 0,k=0;
            while (j < len) {
                if (j == len - 1) {
                    sb.append((j - k+1) + "" + ch[k]);
                    j++;
                    continue;
                }
                if (ch[j] == ch[j + 1]) {
                    j++;
                } else {
                    sb.append((j - k+1) + "" + ch[k]);
                    j++;
                    k = j;
                }
            }
            res = sb.toString();
        }

        return res;
    }

    public static void main(String[] args) {
        String res = countAndSay(2);
        int a = 1;
    }
}
