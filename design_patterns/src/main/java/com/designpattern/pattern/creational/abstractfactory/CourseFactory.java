package com.designpattern.pattern.creational.abstractfactory;

public interface CourseFactory {
    abstract Video getVideo();

    abstract Article getArticle();
}
