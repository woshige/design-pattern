package com.disgin.pattern.factory;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            throw new RuntimeException("工厂中不存在上述的对象");
        } else if ("rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else {
            return new Square();
        }
    }
}
