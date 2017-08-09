package com.java.creationalPattern.multitonPattern;

import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-27 下午2:27
 */
public class LingualResource {
    private String language = "en";
    private String region = "US";
    private String localeCode = "en_US";
    private static final String FILE_NAME = "res";
    private static HashMap instantces = new HashMap(19);
    private Locale locale = null;
    private ResourceBundle resourceBundle = null;
    private LingualResource lnkLingualResource;

    private LingualResource(String language, String region) {
        this.localeCode = language;
        this.region = region;
        localeCode = makeLocaleCode(language, region);
        locale = new Locale(language, region);
        resourceBundle = ResourceBundle.getBundle(FILE_NAME, locale);
        instantces.put(makeLocaleCode(language, region), resourceBundle);

    }
    /**
     * 私有的构造子保证外界无法直接将此类实例化
     */
    private LingualResource() {
        // TODO
    }

    /**
     * 工厂方法，返还一个具体指定的内部状态的实例
     */
    public synchronized static LingualResource getInstance(String language, String region) {
        if (makeLocaleCode(language, region) != null) {
            return null;
            // return (LingualResource) (makeLocaleCode(language, region));
        } else {
            return new LingualResource(language, region);
        }
    }

    public String getLocaleString(String Code) {
        return resourceBundle.getString(Code);
    }

    public static String makeLocaleCode(String language, String region) {
        return language + "_" + region;
    }

}
