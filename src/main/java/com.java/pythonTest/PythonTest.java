package com.java.pythonTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-4-17 上午9:41
 */
public class PythonTest {
    public static void main(String[] args) {
        try {
            List<Double> precipData = new ArrayList<Double>();
            String[] jiangshui = new String[120];
            long startTime = System.currentTimeMillis();
            int lon = 2;
            int lat = 5;
            String path = "/home/mi/workspace/java_study/src/main/java/com.java/pythonTest/test.py";
            String numPath = "/home/mi/rain_predict.npy";
            Process proc = Runtime.getRuntime().exec("python " + path + " " + numPath + " " + lon + " " + lat);
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line;
            int i = 0;
            String result = "";
            while ((line = in.readLine()) != null) {
                // precipData.add(Double.valueOf(line));
                result += line;
                jiangshui[i] = line;
                System.out.println(line);
            }
            System.out.println("result== " + result);
            result = result.replaceAll("\\[|\\]", "");
            System.out.println("result== " + result);
            String[] str = result.split(" ");
            in.close();
            proc.waitFor();
            long endTime = System.currentTimeMillis();
            System.out.println("time: " + (endTime - startTime) + "ms");
            for (int j = 0; j < str.length; j++) {
                precipData.add(Double.valueOf(jiangshui[i]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
