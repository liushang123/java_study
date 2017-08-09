package com.java.leetCode;

/**
 * Created by mi on 17-8-3.
 */
public class LongestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String str=longestCommonPrefix(strs[0],strs[1]);
        int i=2;
        while (i < strs.length) {
            str = longestCommonPrefix(str,strs[i]);
            i++;
        }

        return str;
    }

    public static String longestCommonPrefix(String str1, String str2) {
        int i = 0;
        while (i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        String str = str1.substring(0, i);
        return str;
    }

    public static void main(String[] args) {
        String s = longestCommonPrefix("asbc", "bc");
        System.out.println("str = " + s);
    }
}
