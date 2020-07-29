package com.designpattern.pattern.creational._02_factorymethod;

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
