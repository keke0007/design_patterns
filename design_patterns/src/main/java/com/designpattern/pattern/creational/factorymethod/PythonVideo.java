package com.designpattern.pattern.creational.factorymethod;

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
