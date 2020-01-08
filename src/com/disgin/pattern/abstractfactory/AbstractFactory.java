package com.disgin.pattern.abstractfactory;

import com.disgin.pattern.abstractfactory.color.Color;
import com.disgin.pattern.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shape);

    abstract Color getColor(String color);

}
