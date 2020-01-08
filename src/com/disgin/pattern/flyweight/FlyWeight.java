package com.disgin.pattern.flyweight;

/**
 * 共享的状态，将其进行抽象
 */
public interface FlyWeight {
    void setColor(String color);
    String getColor();
    void display(Coordinate coordinate);
}
