package com.vp.collection.framework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Double> fruitMap = new HashMap<>();
        fruitMap.put("apple",25.0);
        fruitMap.put("banana",15.0);
        fruitMap.put("mango",10.0);
        fruitMap.put("orage",14.8);
        System.out.println(fruitMap);
    }
}
