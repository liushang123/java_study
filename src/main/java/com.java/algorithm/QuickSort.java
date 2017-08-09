package com.java.algorithm;

import java.util.*;

/**
 * Created by mi on 17-6-21.
 */
public class QuickSort {
    public void quick_sort0(int[] a, int s, int t) {
        int i=s,j=t;
        int temp;
        if (s < t) {
            temp = a[s];
            while (i != j) {
                while (j>i && a[j] > temp)
                    j--;
                if (i < j) {
                    a[i] = a[j];
                    i++;
                }
                while (i < j && a[i] < temp) {
                    i++;
                }
                if (i < j) {
                    a[j] = a[i];
                    j--;
                }
            }
            a[i] = temp;
            quick_sort0(a, s, i - 1);
            quick_sort0(a, i + 1, t);
        }
    }
    public int adjustArray(int[] a, int low, int high) {
        int i = low, j=high;
        int key = a[low];
        while(i<j){
            while(i<j && a[j] >=key)
                j--;
            a[i] = a[j];
            while(i<j && a[i]<=key)
                i++;
            a[j] = a[i];

        }
        a[j] = key;
        return j;
    }

    public void quick_sort1(int[] a, int low, int high) {
        if (low < high) {
            int mid = adjustArray(a, low, high);
            quick_sort1(a, low, mid - 1);
            quick_sort1(a, mid + 1, high);
        }
    }

    public int partition(int[] a, int low, int high) {
        int key=a[high];
        int i = low-1;
        for(int j=low;j<=high-1;j++) {
            if(a[j]<=key){
                i++;
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        i++;
        int t = a[i];
        a[i]=a[high];
        a[high] = t;
        return i;
    }

    public void quick_sort2(int[] a, int low, int high) {
        if (low < high) {
            int mid = partition(a, low, high);
            quick_sort2(a, low, mid - 1);
            quick_sort2(a, mid + 1, high);
        }
    }

    public int partition1(int[] a, int low, int high) {
        int key = a[low];
        int i = low;
        for(int j =low+1;j<=high;j++) {
            if (a[j] <= key) {
                i++;
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        int t= a[i];
        a[i] = a[low];
        a[low]=t;
        return i;
    }

    public void quick_sort3(int[] a, int low, int high) {
        if (low < high) {
            int mid = partition1(a, low, high);
            printArray(a);
            quick_sort3(a, low, mid - 1);
            quick_sort3(a, mid + 1, high);
        }
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public class Person {
        String name;
        int number;

        public Person(String name, int number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

    public static void main(String[] args) {
        int[] a = {6, 3,6, 1, 7, 2, 9, 8,6};
        QuickSort qs = new QuickSort();
        qs.quick_sort3(a, 0, 8);
//        int aa = 0;
        System.out.println("开始：");

        QuickSort q = new QuickSort();

        QuickSort.Person p1 = q.new Person("马先生", 1111);
        QuickSort.Person p2 = q.new Person("李先生", 1115);
        QuickSort.Person p3 = q.new Person("王小姐", 1113);

        Map<Number, Person> map = new HashMap<Number, Person>();
        map.put(p1.getNumber(), p1);
        map.put(p2.getNumber(), p2);
        map.put(p3.getNumber(), p3);

        System.out.println("HashMap,无序：");
        for(Iterator<Number> it = map.keySet().iterator();it.hasNext();) {
            Person person = map.get(it.next());
            System.out.println(person.getNumber()+"   "+person.getName());
        }
        System.out.println("TreeMap,升序");
        TreeMap<Number, Person> tr = new TreeMap<Number, Person>();
        tr.putAll(map);
        for(Iterator<Number> it = tr.keySet().iterator();it.hasNext();) {
            Person person = tr.get(it.next());
            System.out.println(person.getNumber() + "   " + person.getName());
        }

        System.out.println("TreeMap,降序");
        TreeMap<Number, Person> tr2 = new TreeMap<Number, Person>(Collections.reverseOrder());
        tr2.putAll(map);
        for(Iterator it = tr2.keySet().iterator();it.hasNext();) {
            Person person = tr2.get(it.next());
            System.out.println(person.getNumber() + "   " + person.getName());
        }
    }
}
