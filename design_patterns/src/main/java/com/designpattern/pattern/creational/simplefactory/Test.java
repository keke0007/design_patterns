package com.designpattern.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        //传统方法
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video==null) return;
//        video.produce();

        //反射创建
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        video.produce();
    }
}
