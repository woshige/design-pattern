package com.disgin.pattern.abstractfactory.shape;

import com.disgin.pattern.abstractfactory.shape.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("square method");
    }
}
