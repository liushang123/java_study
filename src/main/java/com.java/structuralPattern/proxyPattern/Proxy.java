package com.java.structuralPattern.proxyPattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-2 下午1:42
 */
public class Proxy implements Searcher {
    private RealSearcher searcher;
    private UsageLogger usageLogger;
    private AccessValidator accessValidator;
    public Proxy() {
        searcher = new RealSearcher();
    }

    public String doSearch(String userId, String keyValue) {
        if (checkAccess(userId)) {
            String result = searcher.doSearch(null, keyValue);
            logUsage(userId);
            return result;
        } else {
            return null;
        }
    }

    private boolean checkAccess(String userId) {
        accessValidator = new AccessValidator();
        return accessValidator.vaidateUser(userId);
    }

    private void logUsage(String userId) {
        UsageLogger logger = new UsageLogger();
        logger.setUserId(userId);
        logger.save();
    }
}
