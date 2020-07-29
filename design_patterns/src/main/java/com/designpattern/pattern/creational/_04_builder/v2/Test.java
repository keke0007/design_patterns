package com.designpattern.pattern.creational._04_builder.v2;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/7/29 14:18
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.
                CourseBuilder()
                .buildCourseName("Java")
                .build();
        System.out.println(course);
    }
}
