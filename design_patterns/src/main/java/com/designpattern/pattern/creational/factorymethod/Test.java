package com.designpattern.pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        //传统方法
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video==null) return;
//        video.produce();

        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
