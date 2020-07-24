package com.designpattern.principle._3_singleresponsibility;

/**
 * 未实现接口的单一职责原则
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
