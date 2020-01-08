package com.disgin.pattern.abstractfactory;

import com.disgin.pattern.abstractfactory.color.Color;
import com.disgin.pattern.abstractfactory.shape.Circle;
import com.disgin.pattern.abstractfactory.shape.Rectangle;
import com.disgin.pattern.abstractfactory.shape.Shape;
import com.disgin.pattern.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shape) {
        if(shape == null){
           return null;
        }else if("circle".equalsIgnoreCase(shape)){
            return new Circle();
        }else if("square".equalsIgnoreCase(shape)){
            return new Square();
        }else{
            return new Rectangle();
        }
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
