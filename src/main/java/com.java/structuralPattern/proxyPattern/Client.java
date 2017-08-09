package com.java.structuralPattern.proxyPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-2 下午1:38
 */
public class Client {
    private static Searcher searcher;

    public static void main(String[] args) {
        searcher = new Proxy();
        System.out.println(searcher.getClass().getName());
        String userId = "Admin";
        String searcherType = "SEARCH_BY_ACCOUNT_NUMBER";
        String result = searcher.doSearch(userId, searcherType);
        System.out.println(result);
        String a = "aaa";
        String b = "aaa";
        System.out.println("a:" + a.intern());
        System.out.println("b: " + b.intern());

    }
}
