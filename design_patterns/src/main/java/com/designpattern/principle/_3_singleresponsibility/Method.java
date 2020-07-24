package com.designpattern.principle._3_singleresponsibility;

/**
 * 单一职责原则方法层面
 */
public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "geely";
        address = "beijing";
    }

    /**
     * 可变参数注意：
     * 1.一个方法只能有一个可变参数
     * 2.如果方法中有多个参数，可变参数要放到最后。
     * @param userName
     * @param properties
     */
    private void updateUserInfo(String userName,String... properties){
        userName = "geely";
//        address = "beijing";
    }

    private void updateUsername(String userName){
        userName = "geely";
    }
    private void updateUserAddress(String address){
        address = "beijing";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            //todo something1
        }else{
            //todo something2
        }


        userName = "geely";
        address = "beijing";
    }
}
