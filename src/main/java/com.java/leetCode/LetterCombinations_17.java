package com.java.leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mi on 17-8-3.
 */
public class LetterCombinations_17 {
    public static List<String> letterCombinations1(String digits) {
        int len = digits.length();
        List<String> res = new ArrayList<String>();
        String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (len <= 0) {
            return res;
        }
        res.add("");
        for(int i = 0;i<len;i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (res.get(0).length() == i) {
                String t = res.remove(0);
                for (char s : map[x].toCharArray()) {
                    res.add(t + s);
                }
            }
        }
        return res;
    }
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(letterCombinations1("2"));
    }
}
