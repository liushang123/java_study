package com.java.leetCode;

/**
 * Created by mi on 17-8-8.
 */
public class RemoveDuplicates_26 {
    public int removeDuplicates(int[] nums) {
        int i=1,j=1;
        int len = nums.length;
        if (len <= 0) {
            return 0;
        }
        if (len == 1) {
            return 1;
        }
        while (j < len) {
            if (nums[j] == nums[j - 1]) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        return i;
    }
}
