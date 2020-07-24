package com.designpattern.principle._5_lawofdemeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
//    public void checkCourseNum(List<Course> list) {
//        System.out.println(list.size());
//    }
    public void checkCourseNum() {
        List<Course> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Course());
        }
        System.out.println(list.size());
    }
}
