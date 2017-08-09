package com.java.leetCode;

/**
 * Created by mi on 17-8-9.
 */
public class RepeatedSubstringPattern_459 {
    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        if(len<=1)
            return false;
        int j=0;
        while (j < len/2+1) {
            String sub = s.substring(0, j+1);
            int i=j+1;
            while (i < len-j) {
                if (s.substring(i).startsWith(sub)) {
                    i = i + j + 1;
                } else {
                    j++;
                    break;
                }
            }
            if (i >= len) {
                return true;
            }
            if (i + j >= len) {
                break;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "a";
        boolean a = repeatedSubstringPattern(str);
        System.out.println(a);
    }
}
