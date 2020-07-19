package com.designpattern.principle.singleresponsibility;

public class Test {
//    测试类未分离
//    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("鸵鸟");
//    }

//    测试类分离的情况
    public static void main(String[] args) {
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
    }
}
