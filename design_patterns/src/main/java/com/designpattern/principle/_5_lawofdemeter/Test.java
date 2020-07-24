package com.designpattern.principle._5_lawofdemeter;

public class Test {
    //测试未实现迪米特法则 : boss与无关的course耦合
//    public static void main(String[] args) {
//        Boss boss = new Boss();
//        boss.commandCheckNum(new TeamLeader());
//    }

    //boss剔除course只关心teamLeader实现迪米特原则
 public static void main(String[] args) {
     Boss boss = new Boss();
     boss.commandCheckNum(new TeamLeader());
    }
}
