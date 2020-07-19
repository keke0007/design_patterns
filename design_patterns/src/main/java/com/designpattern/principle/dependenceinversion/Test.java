package com.designpattern.principle.dependenceinversion;

public class Test {
//    v1
//    public static void main(String[] args) {
//        Ke ke = new Ke();
//        ke.studyJavaCourse();
//        ke.studyFECourse();
//    }

//    v2基于接口实现
//    public static void main(String[] args) {
//        Ke ke = new Ke();
//        ke.studyCourse(new JavaCourse());
//        ke.studyCourse(new FECourse());
//    }

//    v3 构造器注入
//    public static void main(String[] args) {
//        Ke ke = new Ke(new JavaCourse());
//        ke.studyCourse();
//    }

//    v4 set注入 满足依赖倒置原则,由最高层决定而不由最低层决定
    public static void main(String[] args) {
        Ke ke = new Ke();
        ke.setCourse(new JavaCourse());
        ke.studyCourse();
        ke.setCourse(new FECourse());
        ke.studyCourse();
    }
}
