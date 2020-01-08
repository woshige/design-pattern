package com.disgin.pattern.abstractfactory;

import com.disgin.pattern.abstractfactory.color.Black;
import com.disgin.pattern.abstractfactory.color.Color;
import com.disgin.pattern.abstractfactory.color.Red;
import com.disgin.pattern.abstractfactory.color.White;
import com.disgin.pattern.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }else if("red".equalsIgnoreCase(color)){
            return new Red();
        }else if("black".equalsIgnoreCase(color)){
            return new Black();
        }else{
            return new White();
        }
    }
}
