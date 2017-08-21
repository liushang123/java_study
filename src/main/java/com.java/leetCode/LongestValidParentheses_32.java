package com.java.leetCode;

import java.util.*;

public class LongestValidParentheses_32 {
    public static int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        int lastValidIndex = 0;
        for(int i = 0;i<s.length();i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.empty()) {
                    lastValidIndex = i + 1;
                } else {
                    stack.pop();
                    if (stack.empty()) {
                        max = Math.max(max, i - lastValidIndex + 1);
                    } else {
                        max = Math.max(max, i - stack.peek());
                    }
                }
            }
        }

        return max;
    }

    public static int longestValidParentheses2(String s) {
        int max = 0,tmp = 0;;
        int len = s.length();
        for(int i=0;i<len -2;i++) {
            for(int j = i+1;j<len-1;j++) {
                if (legal(s, i, j)) {
                    tmp=j-i+1;
                }
                max = tmp>max?tmp:max;
            }
        }

        return max;
    }

    public static boolean legal(String s, int start, int end) {
        Stack<Character> stack = new Stack<>();
        int i = start, j = end;
        while (i<=j){
            if(s.charAt(i) == '(')
                stack.push('(');
            else if (s.charAt(i) == ')' && !(stack.empty())) {
                stack.pop();
            }else
                return false;
            i++;
        }
        if (stack.size() > 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "()(())";
        boolean flag = legal(s, 0, s.length()-1);
        int a = longestValidParentheses(s);
        System.out.println(a);
    }
}
