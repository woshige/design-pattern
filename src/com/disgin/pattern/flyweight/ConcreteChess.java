package com.disgin.pattern.flyweight;

/**
 * 具体的实现类
 */
public class ConcreteChess implements FlyWeight {
    private String color;
    public ConcreteChess(String color){
        this.color = color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("color:" + color + "locate:" + "x" + coordinate.getX() + ",y" + coordinate.getY());
    }
}
