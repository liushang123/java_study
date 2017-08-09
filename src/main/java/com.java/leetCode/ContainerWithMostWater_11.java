package com.java.leetCode;

/**
 * Created by mi on 17-8-3.
 */
public class ContainerWithMostWater_11 {

    public static int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int  max = 0;
        while (i < j) {
            int min = height[i] < height[j] ? height[i] : height[j];
            int cur = min*(j-i);
            max = cur > max ? cur : max;
            if (height[i] < height[j]) {
                i++;
            }else {
                j--;
            }
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
