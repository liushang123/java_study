package com.java.structuralPattern.decoratorPattern;

import java.io.BufferedReader;
import java.io.FilterReader;
import java.io.IOException;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-1 下午1:26
 */
public class GrepReader extends FilterReader {
    protected String substring;
    protected BufferedReader in;
    private int lineNumber;

    public GrepReader(FilterReader in, String substring) {
        super(in);
        this.in = new BufferedReader(in);
        this.substring = substring;
        lineNumber = 0;
    }
    public final String readLine() throws IOException {
        String line;
        do {
            line = in.readLine();
            lineNumber++;
        } while (line != null && line.indexOf(substring) == -1);
        return line;
    }

    public int getLineNo() {
        return lineNumber;
    }
}
