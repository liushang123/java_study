package com.java.innerClass;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-13 下午1:42
 */
public class Son {
    class Father_1 extends Father {
        public int strong() {
            return super.strong() + 1;
        }
    }

    class Mother_1 extends Mother {
        public int kind() {
            return super.kind() - 2;
        }
    }
    public int getStrong() {
        return new Father_1().strong();
    }

    public int getKind() {
        return new Mother_1().kind();
    }
}
