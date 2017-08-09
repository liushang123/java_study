package com.java.leetCode;

/**
 * Created by mi on 17-8-2.
 */
public class RegularExpressionMatching_10 {
    public static boolean isMatch(String s, String p) {
        boolean[][] f = new boolean[s.length() + 1][p.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= p.length(); j++) {
                f[i][j] = false;
            }
        }
        f[0][0] = true;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                    f[i][j] = f[i - 1][j - 1];
                }
                if (p.charAt(j - 1) == '*') {
                    if (i == 0 || (s.charAt(i - 1) != p.charAt(j - 2) && p.charAt(j - 2) != '.')) {
                        f[i][j] = f[i][j - 2];
                    } else {
                        f[i][j] = f[i - 1][j] || f[i][j - 1] || f[i][j - 2];
                    }
                }
            }
        }
        return f[s.length()][p.length()];
    }

    public static boolean isMatch2(String s, String p) {
        if (p.length()==0) {
            return s.length()==0;
        }

        if (p.length() == 1 || p.charAt(1) != '*') {
            if (s.length()==0 || (p.charAt(0) != '.' && p.charAt(0) != s.charAt(0))) {
                return false;
            } else {
                return isMatch2(s.substring(1), p.substring(1));
            }
        }

        while (s.length()>0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
            if (isMatch2(s, p.substring(2))) {
                return true;
            }
            s = s.substring(1);
        }

        return isMatch2(s, p.substring(2));
    }


    public static void main(String[] args) {
        boolean a = isMatch2("aaaabx","a*ab");
        System.out.print(a);
        int ab=1;
    }
}
