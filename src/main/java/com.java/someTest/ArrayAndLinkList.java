package com.java.someTest;

import java.util.*;

/**
 * Created by mi on 17-7-27.
 */
public class ArrayAndLinkList {
    public static final int N = 50000;
    public static List values;
    static{
        Integer vals[] = new Integer[N];
        Random r = new Random();
        for (int i = 0, currval = 0; i < N; i++) {
            vals[i] = new Integer(currval);
            currval += r.nextInt(100) + 1;
        }
        values = Arrays.asList(vals);
    }

    static long timeList(List lst) {
        long start = System.currentTimeMillis();
        for(int i=0;i<N;i++) {
            int index = Collections.binarySearch(lst, values.get(i));
            if (index != i) {
                System.out.println("***错误***");
            }

        }
        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {
        System.out.println("ArrayList消耗时间：" + timeList(new ArrayList(values)));
        System.out.println("LinkedList消耗时间：" + timeList(new LinkedList(values)));
    }
}
