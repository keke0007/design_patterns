package com.designpattern.principle.dependenceinversion;

public class Ke {
    //    v1 自己实现
//    public void studyJavaCourse() {
//        System.out.println("学习Java课程");
//    }
//
//    public void studyFECourse() {
//        System.out.println("学习前端课程");
//    }

//    v2 接口实现
//    public void studyCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }


    private ICourse iCourse;
    //    v3 构造器注入
//    public Ke(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }

//    v4 set注入
    public void setCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
    public void studyCourse() {
        iCourse.studyCourse();
    }
}
