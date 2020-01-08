package com.disgin.pattern.abstractfactory.shape;

import com.disgin.pattern.abstractfactory.shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle method");
    }
}
