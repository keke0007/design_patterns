package com.designpattern.pattern.creational._03_abstractfactory;

public interface CourseFactory {
    abstract Video getVideo();

    abstract Article getArticle();
}
