package com.java.leetCode;

public class SearchforRange_34 {
    public static int[] searchRange(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        int[] res = new int[2];
        int start = -1, end = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                if (mid == 0) {
                    start = mid;
                    break;
                }
                if (nums[mid-1] < target) {
                    start = mid;
                    break;
                } else if (mid > left && nums[mid-1] == target) {
                    right = mid - 1;
                }

            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        res[0] = start;
        left = 0;
        right = nums.length-1;
        while (left <= right) {
            int mid = (left + right+1) / 2;
            if (nums[mid] == target) {
                if (mid == nums.length - 1) {
                    end = mid;
                    break;
                }
                if (nums[mid+1] > target) {
                    end = mid;
                    break;
                } else if (mid > left && nums[mid] == target) {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        res[1] = end;
        return res;
    }

    public static void main(String[] args) {
        int[] sea = {2};
        int[] a = searchRange(sea, 2);
        int tmp = 1;
    }
}
