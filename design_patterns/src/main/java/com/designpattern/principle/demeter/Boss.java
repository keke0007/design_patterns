package com.designpattern.principle.demeter;

public class Boss {
    public void commandCheckNum(TeamLeader teamLeader) {
//        List<Course> list = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            list.add(new Course());
//        }
//        teamLeader.checkCourseNum(list);
        teamLeader.checkCourseNum();
    }
}
