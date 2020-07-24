package com.designpattern.principle._6_liskovsubstitution;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/7/24 11:02
 */
public class Test {
    public static void main(String[] args) {
        /*Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);*/
        Square square = new Square();
        square.setLength(10);
        // resize(square);  resize方法只适用于Rectangle不适用于Square
    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight() + 1);
            String result = String.format("width: %d,height: %d", rectangle.getWidth(), rectangle.getHeight());
            System.out.println(result);
        }

        String result = String.format("resize方法结束 :  %d,height: %d", rectangle.getWidth(), rectangle.getHeight());
        System.out.println(result);
    }
}
