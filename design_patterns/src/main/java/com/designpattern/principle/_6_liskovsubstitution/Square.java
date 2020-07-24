package com.designpattern.principle._6_liskovsubstitution;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/7/24 11:00
 */
public class Square implements Quadrangle{
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return getLength();
    }

    @Override
    public long getHeight() {
        return getLength();
    }

}
