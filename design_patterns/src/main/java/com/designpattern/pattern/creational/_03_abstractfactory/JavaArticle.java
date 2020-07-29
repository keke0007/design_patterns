package com.designpattern.pattern.creational._03_abstractfactory;

public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java手记");
    }
}
