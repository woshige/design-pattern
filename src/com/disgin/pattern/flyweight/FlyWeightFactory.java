package com.disgin.pattern.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
    /**
     * 实现享元模式的核心的就是利用一个Map来对其中要进行复用的对象进行缓存
     */
    private static HashMap<String, FlyWeight> map = new HashMap<>();

    public static FlyWeight getFlyWeight(String color) {
        if (map.containsKey(color)) {
            return map.get(color);
        } else {
            map.put(color, new ConcreteChess(color));
            return map.get(color);
        }
    }
}
