package com.java.leetCode;

/**
 * Created by mi on 17-8-1.
 */
public class leetCode_8 {
    public int myAtoi(String str) {
        int p=0;
        int flag = 1;
        if(str.length()==0)return 0;
        while(str.charAt(p)==' '){
            p++;
        }
        if(str.charAt(p)=='-'){
            p++;
            flag = -1;
        }
        if (str.charAt(p) == '+') {
            p++;
            flag = 1;
        }
        int y=0;
        for(int i=p;i<str.length();i++) {
            int digit = str.charAt(i)-'0';
            if (digit < 0 || digit > 9) {
                break;
            }
            if (y >= Integer.MAX_VALUE || y <= Integer.MIN_VALUE) {
                return flag==1? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            y = y*10 + str.charAt(i) - '0';
        }

        return y*flag;
    }

    public static void main(String[] args) {


    }
}
