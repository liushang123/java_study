package com.java.thinkInJava.c11;

import java.util.*;

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        HashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("aaa", "aaa");
        lhm.put("bbb", "bbb");
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for(String c:ral){
            System.out.print(c+" ");
        }
        System.out.println();
        for (String c : ral.reversed()) {
            System.out.print(c+" ");
        }
        System.out.println();

    }
}

class  ReversibleArrayList<T> extends ArrayList<T>{
    public ReversibleArrayList(Collection<T> c){super(c);}
    public Iterable<T> reversed(){
        return  new Iterable<T>() {
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    public boolean hasNext(){
                        return current>-1;
                    }

                    public T next(){
                        return get(current--);
                    }

                    public void remove(){
                        throw  new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
