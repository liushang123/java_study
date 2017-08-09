package com.java.leetCode;

/**
 * Created by mi on 17-8-9.
 */
public class MyStrStr_28 {
    public int strStr(String haystack, String needle) {
        int i=0,j=0;
        int[] next = getNext0(needle);
        while (i < haystack.length() && j < needle.length()) {
            if (j== -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == needle.length()) {
            return i - j;
        }
        return -1;
    }

    public static int[] getNext0(String ps)
    {
        char[] strKey = ps.toCharArray();
        int[] next = new int[strKey.length];

        // 初始条件
        int j = 0;
        int k = -1;
        next[0] = -1;

        // 根据已知的前j位推测第j+1位
        while (j < strKey.length - 1)
        {
            if (k == -1 || strKey[j] == strKey[k])
            {
                next[++j] = ++k;
            }
            else
            {
                k = next[k];
            }
        }

        return next;
    }
    public static int[] getNext1(String ps)
    {
        char[] strKey = ps.toCharArray();
        int[] next = new int[strKey.length];

        // 初始条件
        int j = 0;
        int k = -1;
        next[0] = -1;

        // 根据已知的前j位推测第j+1位
        while (j < strKey.length - 1)
        {
            if (k == -1 || strKey[j] == strKey[k])
            {
                // 如果str[j + 1] == str[k + 1]，回退后仍然失配，所以要继续回退
                if (strKey[j + 1] == strKey[k + 1])
                {
                    next[++j] = next[++k];
                }
                else
                {
                    next[++j] = ++k;
                }
            }
            else
            {
                k = next[k];
            }
        }

        return next;
    }

    public static void main(String[] args) {
        String str = "aaabaaab";
        int[] a = getNext0(str);
        int[] b = getNext1(str);
        int ab = 1;
    }
}
