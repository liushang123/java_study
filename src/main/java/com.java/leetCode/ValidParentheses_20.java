package com.java.leetCode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by mi on 17-8-7.
 */
public class ValidParentheses_20 {
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        }
        Deque<Character> parenttheses = new ArrayDeque();
        for(int i = 0;i<len;i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                parenttheses.addFirst(s.charAt(i));
            } else if(parenttheses.size()<=0){
                return false;
            }
            if (s.charAt(i) == ')') {
                Character tmp = parenttheses.pollFirst();
                if (tmp != '(') {
                    return false;
                }
            }else if (s.charAt(i) == ']') {
                Character tmp = parenttheses.pollFirst();
                if (tmp != '[') {
                    return false;
                }
            }else if (s.charAt(i) == '}') {
                Character tmp = parenttheses.pollFirst();
                if (tmp != '{') {
                    return false;
                }
            }
        }
        if (parenttheses.size() > 0) {
            return false;
        }
        return true;
    }
}
