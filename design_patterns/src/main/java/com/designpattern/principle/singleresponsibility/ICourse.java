package com.designpattern.principle.singleresponsibility;

/**
 * 未实现接口的单一职责原则
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
