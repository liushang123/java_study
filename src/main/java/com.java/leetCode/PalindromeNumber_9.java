package com.java.leetCode;

/**
 * Created by mi on 17-8-3.
 */
public class PalindromeNumber_9 {
    public static boolean isPalindrome(int x) {
        int y=0;
        int  tmp = x;
        if(x<0)
            return false;
        while( x != 0){
            y = y*10+x%10;
            x /= 10;
            if (y > Integer.MAX_VALUE/10 && x>0){
                return false;
            }
        }
        if(y==tmp)
            return true;
        return false;
    }

    public static void main(String[] main) {
        boolean flag = isPalindrome(1000000001);
        System.out.println(flag);
    }
}
