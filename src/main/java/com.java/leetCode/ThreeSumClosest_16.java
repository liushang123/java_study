package com.java.leetCode;

import java.util.Arrays;

/**
 * Created by mi on 17-8-3.
 */
public class ThreeSumClosest_16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closeTaget = nums[0]+nums[1]+nums[2];
        for (int i=0;i<nums.length-2;i++) {
            int j=i+1,k=nums.length-1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum- target) < Math.abs(closeTaget- target)) {
                    closeTaget = sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return closeTaget;
    }

    public static void main(String[] args) {
        int[] a = {-1, -5, -3, -4, 2, -2};
        int b = threeSumClosest(a, -0);
        System.out.print(b);
    }
}
