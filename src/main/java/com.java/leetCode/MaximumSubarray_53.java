package com.java.leetCode;

/**
 * Created by mi on 17-8-24.
 */
public class MaximumSubarray_53 {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (sum >= 0) {
                sum += nums[i];
                max = max > sum ? max : sum;
            } else {
                if (nums[i] >= sum) {
                    max = nums[i] > max ? nums[i] : max;
                    sum = nums[i];
                }
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = {1, -2, 0};
        int max = maxSubArray(a);
        int b = 0;
    }
}
