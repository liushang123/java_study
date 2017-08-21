package com.java.leetCode;

import java.util.Arrays;

public class NextPermutation_31 {
    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len-1;
        while (i > 0) {
            if(nums[i]>nums[i-1])
                break;
            i--;
        }
        if (i == 0) {
            Arrays.sort(nums);
        } else {
            int j=len-1;
            while (j>=i){
                if(nums[j]>nums[i-1])
                    break;
                j--;
            }
            int tmp = nums[i-1];
            nums[i-1] = nums[j];
            nums[j] = tmp;
            Arrays.sort(nums,i,len);
        }
    }

    public static void permutation(char[] s,int from,int to) {
        if(to <= 1)
            return;
        if(from == to) {
            System.out.println(s);
        } else {
            for(int i=from; i<=to; i++) {
                swap(s,i,from); //交换前缀，使其产生下一个前缀
                permutation(s, from+1, to);
                swap(s,from,i); //将前缀换回，继续做上一个前缀的排列
            }
        }
    }

    public static void swap(char[] s,int i,int j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }

    public static void main(String[] args) {
        char[] s = {'a','b','c'};
        permutation(s,0,2);
        int[] a = {1,3,2};
        nextPermutation(a);
        int ke = 1;
    }
}
