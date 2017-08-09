package com.java.behavioralPattern.immutablePattern;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-6 下午1:51
 */
public class Test extends Date {
    public static boolean VerifyAquenceOfBSF(int sequece[], int length) {
        if (sequece == null || length <= 0) {
            return false;
        }
        int root = sequece[length - 1];
        int i = 0;
        for (; i < length - 1; i++) {
            if (sequece[i] > root) {
                break;
            }
        }
        int j = i;
        for (; j < length - 1; j++) {
            if (sequece[j] < root) {
                return false;
            }
        }
        boolean left = true;
        if (i > 0) {
            left = VerifyAquenceOfBSF(sequece, i);
        }
        boolean right = true;
        if (i < length - 1) {
            right = VerifyAquenceOfBSF(sequece, length - i - 1);
        }
        return left && right;
    }
    public void te() {
        System.out.println(super.getClass().getName());
    }
    class InnerClass {
        public void tes() {
            System.out.println(super.getClass().getName());
        }
    }
    public static void main(String[] args) {
        new Test().te();
        Test te = new Test();
        te.new InnerClass().tes();
        new Test().new InnerClass().tes();

        String[] ddd = "wwwdadadddaa".split("a");
        for (int i = 0; i < ddd.length; i++) {
            System.out.println(ddd[i]);
        }

        StringTokenizer st = new StringTokenizer("www.ooobj.com", ".b");
        while (st.hasMoreElements()) {
            System.out.println("Token:" + st.nextToken());
        }

        int i = 10000000;
        char e = (char) i;
        i = e;
        System.out.println(i);
        int a = 1;
        int b = 2;
        int c = 2;
        int d = b ^ c ^ a;

        System.out.print(d);
        Map<String, String> map = new HashMap<String, String>();

    }
}
