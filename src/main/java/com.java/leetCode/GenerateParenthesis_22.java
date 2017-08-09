package com.java.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mi on 17-8-7.
 */
public class GenerateParenthesis_22 {
    public static List<String> generateParenthesis(int n) {
        List<String> re = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        re.add("");
        count.add(0);
        for(int i=0;i<2*n;i++) {
            while (re.get(0).length() == i) {
                String tmp = re.remove(0);
                int cou = count.remove(0);
                int len = tmp.length();
                if (cou == n) {
                    re.add(tmp + ")");
                    count.add(cou);
                    continue;
                }
                if (2*cou - len > 0 ) {
                    re.add(tmp+"(");
                    count.add(cou + 1);
                    re.add(tmp + ")");
                    count.add(cou);
                }else {
                    re.add(tmp + "(");
                    count.add(cou+1);
                }
            }
        }
        return re;
    }

    public static List<String> generateParenthesis2(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public static void backtrack(List<String> list, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            list.add(str);
            return;
        }
        if (open < max) {
            backtrack(list, str + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(list, str + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        List<String> res =  generateParenthesis2(3);
        System.out.println(res);
    }
}
