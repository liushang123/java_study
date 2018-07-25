package com.java.leetCode;

public class FindDuplicate_287 {
    public int findDuplicate(int[] nums) {
        int left=1;
        int len = nums.length;
        int right = len-1;
        while (left < right) {
            int mid = (left + right) / 2;
            int count = 0;
            int base = 0;
            for (int i=0;i<len;i++) {
                if (nums[i] <= mid) {
                    count++;
                }
            }
            if (count  < mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
