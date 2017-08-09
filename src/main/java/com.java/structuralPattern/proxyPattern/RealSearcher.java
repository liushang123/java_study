package com.java.structuralPattern.proxyPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-2 下午1:51
 */
public class RealSearcher implements Searcher {
    public RealSearcher() {

    }

    public String doSearch(String userId, String keyValue) {
        String sql = "";
        return "result set";
    }
}
