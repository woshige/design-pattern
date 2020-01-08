package com.disgin.pattern.abstractfactory.shape;

import com.disgin.pattern.abstractfactory.shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle method");
    }
}
