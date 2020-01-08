package com.disgin.pattern.abstractfactory.color;

public class White implements Color {
    @Override
    public void fill() {
        System.out.println("white method");
    }
}
