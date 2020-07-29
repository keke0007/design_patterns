package com.designpattern.pattern.creational._04_builder;

import java.text.MessageFormat;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/7/29 14:12
 */
public class Test {
    public static void main(String[] args) {
        // Coach coach = new Coach();
        // CourseBuilder courseBuilder = new CourseActualBuilder();
        // coach.setCourseBuilder(courseBuilder);
        // Course course = coach.makeCourse("Java", "JavaPPT", "JavaVideo", "JavaArticle", "JavaQA");
        // System.out.println(course);

        //格式化字符串
        String a = "test";
        int b = 100;
        String content = "wo shi {0},wo jin {1}";
        System.out.println(MessageFormat.format(content, a, b));
    }
}
