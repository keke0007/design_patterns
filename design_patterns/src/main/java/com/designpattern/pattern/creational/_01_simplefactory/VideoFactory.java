package com.designpattern.pattern.creational._01_simplefactory;

public class VideoFactory {

    //通过type创建对象不满足开闭原则可以通过反射传入类名的方式解决
//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        }
//        return null;
//    }
    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video  = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
