package com.designpattern.principle._1_openclose;

public class Test {
    public static void main(String[] args) {
        //未拓展折扣方法
//        ICourse javaCourse = new JavaCourse(1, "javaCourse", 348d);
//        System.err.println("课程id : "+javaCourse.getId()+" 课程名称 :"+javaCourse.getName()+" 课程价格 : "+javaCourse.getPrice());

        //拓展折扣方法
        ICourse iCourse = new JavaCourseDiscount(1, "javaCourse", 348d);
        JavaCourseDiscount javaCourse = (JavaCourseDiscount) iCourse;
        System.err.println("课程id : "+javaCourse.getId()+" 课程名称 :"+javaCourse.getName()+
                " 课程原价: "+javaCourse.getOriginPrice()+" 课程折扣后价格 :"+javaCourse.getPrice());
    }
}
