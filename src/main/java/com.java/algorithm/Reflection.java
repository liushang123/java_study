package com.java.algorithm;
/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-28 上午9:23
 */
public class Reflection {
    public static void test1() {
        Reflection reflection = new Reflection();
        System.out.println(reflection.getClass().getName());
    }

    public static void test2() {
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        try {
            class1 = Class.forName("com.java.algorithm.Reflection");
            class2 = new Reflection().getClass();
            class3 = Reflection.class;
            System.out.println("class1‘s name: " + class1.getName());
            System.out.println("class2‘s name: " + class2.getName());
            System.out.println("class3‘s name: " + class3.getName());
        } catch (ClassNotFoundException e) {

        }

    }
    public static int findSortedArray(int[] nums1, int[] nums2, int low1, int low2, int k) {
        if (k == 1) {
            return nums1[low1] > nums2[low2] ? nums2[low2] : nums1[low1];
        }
        int mid1 = (low1 + nums1.length - 1) / 2, mid2 = (low2 + nums2.length - 1) / 2;
        if (mid1 >= nums1.length - 1) {
            return nums2[k + low2 - 1];
        }
        if (nums1[mid1] < nums2[mid2]) {
            return findSortedArray(nums1, nums2, mid1 + 1, low2, k - mid1 - low2 - 1);
        } else if (nums1[mid1] > nums2[mid2]) {
            return findSortedArray(nums1, nums2, low1, mid2 + 1, k - mid2 - low1 - 1);
        } else {
            return findSortedArray(nums1, nums2, mid1, mid2, k - mid1 - mid2);
        }

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if (len % 2 == 0) {
            if (nums1.length < nums2.length) {
                return (double) (findSortedArray(nums1, nums2, 0, 0, len / 2) + findSortedArray(nums1, nums2, 0, 0, len / 2 + 1)) / 2.0;
            } else {
                return (double) (findSortedArray(nums2, nums1, 0, 0, len / 2) + findSortedArray(nums2, nums1, 0, 0, len / 2 + 1)) / 2.0;
            }

        } else {
            if (nums1.length < nums2.length) {
                return (double) findSortedArray(nums1, nums2, 0, 0, len / 2 + 1);
            } else {
                return (double) findSortedArray(nums2, nums1, 0, 0, len / 2 + 1);
            }

        }
    }
    public static String longestPalindrome(String s) {

        int x = 0, y = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; i - j >= 0 && i + j < s.length(); j++) {
                if (s.charAt(i - j) != s.charAt(i + j))
                    break;
                if (j * 2 + 1 > max) {
                    max = j * 2 + 1;
                    x = i - j;
                    y = i + j;
                }
            }
            for (int j = 0; i - j >= 0 && i + j + 1 < s.length(); j++) {
                if (s.charAt(i - j) != s.charAt(i + j + 1))
                    break;
                if (2 * j + 2 > max) {
                    max = 2 * j + 2;
                    x = i - j;
                    y = i + j + 1;
                }
            }
        }
        String res = s.substring(x, y);
        return res;
    }

    public static void main(String[] args) {
        String st = "a";
        char ch = st.charAt(0);
        String str = longestPalindrome("b");
        int[] a = {1, 3, 5, 6};
        int[] b = {2, 7, 7, 7, 9, 9, 9};
        double c = findMedianSortedArrays(a, b);
        System.out.println(c);
        Reflection.test2();
    }
}
