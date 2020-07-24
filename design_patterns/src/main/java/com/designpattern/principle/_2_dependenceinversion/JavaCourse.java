package com.designpattern.principle._2_dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
