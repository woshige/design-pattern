package com.disgin.pattern.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryName) {
        if (factoryName == null) {
            return null;
        } else if ("shapeFactory".equalsIgnoreCase(factoryName)) {
            return new ShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
