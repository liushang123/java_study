package com.java.myServlet;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-21 下午7:42
 */
@WebServlet(name = "MyServlet", urlPatterns = {"/my"})
public class MyServlet {

    public void init(ServletConfig servletConfig) throws ServletException {

    }

}
