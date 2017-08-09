package com.java.immutablePattern.chainOfResponsibility.one;

/**
 * Created by mi on 17-7-26.
 */
public abstract class Handler {

    protected Handler successor;

    /**
     * 处理方法，调用此方法处理请求
     */
    public abstract void handleRequest();

    /**
     * 赋值方法，调用此方法设定下家
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 取值方法
     */
    public Handler getSuccessor() {
        return successor;
    }
}
