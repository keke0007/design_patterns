package com.designpattern.principle._1_openclose;

public class JavaCourseDiscount extends JavaCourse {
    public JavaCourseDiscount(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
