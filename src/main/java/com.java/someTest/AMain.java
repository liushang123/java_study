package com.java.someTest;

import java.io.*;
import java.util.Arrays;

public class AMain {
    public static int partition(int[] a, int low, int high) {
        int i = low, j = high;
        int key = a[i];
        while (i < j) {
            while (i < j && a[j] >= key) {
                j--;
            }
            a[i] = a[j];
            while (i < j && a[i] <= key) {
                i++;
            }
            a[j] = a[i];

        }
        a[i] = key;
        return j;
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = partition(a, low, high);
            quickSort(a, low, mid - 1);
            quickSort(a,mid+1,high);
        }
    }
    public static void main(String[] args) throws IOException{
        int[] a = {6, 3,6, 1, 7, 2, 9, 8,6};

        quickSort(a, 0, 8);

        int b=0;
        /*File file = new File("random.in");
        BufferedReader reader = null;
        int N = 0;
        String str = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            int line = 1;
            String tmp = null;
            while ((tmp = reader.readLine())!=null){
                if(line == 1){
                    N = Integer.parseInt(tmp);
                }
                if(line == 2){
                    str = tmp;
                }
                line++;
            }
            reader.close();
        } catch (IOException e) {
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }
        }
        String[] tmp = str.split(" ");
        int[] a = new int[N];
        for(int i=0;i<N;i++) {
            a[i] = Integer.parseInt(tmp[i]);
        }
        Arrays.sort(a);
        int j = 0;
        for(int i =1;i<N;i++) {
            if(a[i]==a[i-1]){
                continue;
            }else {
                j++;
                a[j] = a[i];
            }
        }

        File fileOut = new File("random.out");
        try {
            fileOut.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter  bw=new BufferedWriter(fw);
        bw.write(j+1);
        bw.write("\t\n");
        for(int k=0;k<=j;k++) {
            bw.write(a[k]);
        }
        bw.write("\t\n");*/

    }
}
