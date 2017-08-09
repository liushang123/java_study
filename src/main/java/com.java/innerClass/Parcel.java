package com.java.innerClass;
/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-2-16 下午7:21
 */
public class Parcel {
    class Content {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }
    private class tes {
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Content content() {
        return new Content();
    }

    public void ship(String dest) {
        Content c = content();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    private void test() {

    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        Destination ddd = p.new Destination("sss");
        tes tes = p.new tes();
        p.ship("Tasmaina");
        Parcel q = new Parcel();
        Content c = q.content();
        Destination d = q.to("Borneo");
    }
}
