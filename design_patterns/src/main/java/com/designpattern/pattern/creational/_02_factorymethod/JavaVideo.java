package com.designpattern.pattern.creational._02_factorymethod;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
