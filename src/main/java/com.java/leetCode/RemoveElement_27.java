package com.java.leetCode;

/**
 * Created by mi on 17-8-8.
 */
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int len = nums.length;
        for (int j = 0; j < len; j++) {
            if (nums[j] == val) {
                continue;
            }
            nums[i] = nums[j];
            i++;
        }
        return i;
    }
}
