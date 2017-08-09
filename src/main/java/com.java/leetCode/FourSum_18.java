package com.java.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mi on 17-8-7.
 */
public class FourSum_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len-3;i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j=i+1;j<len-2;j++) {
                if (j > i+1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int m = j+1,n=len-1;
                while (m < n) {
                    if (nums[i] + nums[j] + nums[m] + nums[n] == target) {
                        re.add(Arrays.asList(nums[i], nums[j], nums[m], nums[n]));
                        m++;
                        n--;
                        while (nums[m] == nums[m - 1] && m < n) {
                            m++;
                        }
                        while (nums[n] == nums[n + 1] && m < n) {
                            n--;
                        }
                    } else if (nums[i] + nums[j] + nums[m] + nums[n] > target) {
                        n--;
                    } else {
                        m++;
                    }

                }
            }
        }
        return re;
    }
}
