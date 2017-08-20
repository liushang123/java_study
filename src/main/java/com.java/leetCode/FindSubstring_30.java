package com.java.leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindSubstring_30 {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        boolean flag = true;
        int start=0;
        while (s.length() > 0  && start<s.length()) {
            int index = s.length();
            int max = 0;
            int minIndex = 0;
            int maxIndex = 0;
            int wordsLenth = 0;
            int count = 0;
            for(int i = 0;i<words.length;i++) {
                wordsLenth += words[i].length();
                int tmp = s.indexOf(words[i], start);
                if (tmp == -1) {
                    count++;
                    continue;
                }
                if (tmp <= index) {
                    index = tmp;
                    minIndex = i;
                }
                if (tmp >= max) {
                    max = tmp;
                    maxIndex = i;
                }
            }
            if (max-index+words[maxIndex].length() == wordsLenth) {
                res.add(index);
            }
            start = index + words[minIndex].length();
            if (count == words.length) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] word = {"foo", "bar","the"};
        List<Integer> res = findSubstring("barfoofoobarthefoobarman", word);
        System.out.println(res);
    }
}
