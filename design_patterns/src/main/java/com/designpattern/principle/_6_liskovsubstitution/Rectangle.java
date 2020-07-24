package com.designpattern.principle._6_liskovsubstitution;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/7/24 10:52
 */
public class Rectangle implements Quadrangle {
    private long height;
    private long width;

    public long getWidth() {
        return width;
    }

    public long getHeight() {
        return height;

    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
