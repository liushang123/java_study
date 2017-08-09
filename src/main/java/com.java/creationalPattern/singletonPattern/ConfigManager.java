package com.java.creationalPattern.singletonPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-24 下午2:56
 */
public class ConfigManager {
    private static final String PFILE = System.getProperty("user.dir") + File.separator + "Singleton.properties";
    private File m_file = null;
    private long m_lastModifiedTime = 0;
    private Properties m_prop = null;
    private static ConfigManager m_instance = new ConfigManager();

    private ConfigManager() {
        m_file = new File(PFILE);
        m_lastModifiedTime = m_file.lastModified();
        if (m_lastModifiedTime == 0) {
            System.err.println(PFILE + "file does not exist");
        }
        m_prop = new Properties();
        try {
            m_prop.load(new FileInputStream(PFILE));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized static ConfigManager getInstance() {
        return m_instance;
    }

    public final Object getConfigItem(String name, Object defaultVal) {
        long newTime = m_file.lastModified();
        // 检查属性文件是否被其他程序（或者程序员手动）修改过
        // 如果是，重新读取文件
        if (newTime == 0) {
            if (m_lastModifiedTime == 0) {
                System.err.println(PFILE + "file does not exist!");
            } else {
                System.err.println(PFILE + "file was deleted!");
            }
            return defaultVal;
        } else if (newTime > m_lastModifiedTime) {
            m_prop.clone();
            try {
                m_prop.load(new FileInputStream(PFILE));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m_lastModifiedTime = newTime;
        Object val = m_prop.getProperty(name);
        if (val == null) {
            return defaultVal;
        } else {
            return val;
        }
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type quit to quit");
        do {
            System.out.print("Property item to read:");
            try {
                String line = reader.readLine();
                if (line.equals("quit")) {
                    break;
                }
                System.out.println(ConfigManager.getInstance().getConfigItem(line, "Not fount"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }
}
