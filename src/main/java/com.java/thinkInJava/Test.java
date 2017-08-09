package com.java.thinkInJava;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

/**
 * Created by mi on 17-5-18.
 */
public class Test {
    public static void main(String[] args) {
        String alert = ",";
        JSONArray alertJsonArr = new JSONArray();
        if(alert.length()>0 && !("".equals(alert))){
            String[] alertArr = alert.split(",");
            for (int i = 1; i < alertArr.length; i++) {
                alertJsonArr.add(alertArr[i]);
            }
        }
        String va = JSON.toJSONString(alertJsonArr);
        System.out.println(va);
        String str = "[\"台风_白色\",\"暴雪_蓝色\",\"寒潮_蓝色\",\"沙尘暴_黄色\"]";
        JSONArray js = JSONArray.parseArray(str);
        System.out.println(js);

    }
}
