package com.java.leetCode;

public class SearchRotatedSortedArray_33 {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        for(int i=0;i<len;i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int search1(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        while (left < right) {
            int mid = (left+right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[left] < nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid -1;
                }
            }
        }
        return -1;
    }
}
