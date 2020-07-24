package com.designpattern.principle._2_dependenceinversion;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习前端课程");
    }
}
