package com.disgin.pattern.flyweight;

public class FlyWeightTest {
    public static void main(String[] args) {
        FlyWeight black = FlyWeightFactory.getFlyWeight("black");
        FlyWeight white = FlyWeightFactory.getFlyWeight("white");
        FlyWeight anotherBlack = FlyWeightFactory.getFlyWeight("black");
        System.out.println(black);
        System.out.println(white);
        System.out.println(anotherBlack);
        System.out.println("===========增加外部状态==========");
        black.display(new Coordinate(10, 20));
        white.display(new Coordinate(10,20));
        anotherBlack.display(new Coordinate(10,39));
    }
}
