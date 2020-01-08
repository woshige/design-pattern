package com.disgin.pattern.factory;

/**
 * 不需要具体的去关心实际创建的逻辑
 */
public class FactoryTest {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();
        Shape square = ShapeFactory.getShape("square");
        square.draw();
        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();
    }
}
