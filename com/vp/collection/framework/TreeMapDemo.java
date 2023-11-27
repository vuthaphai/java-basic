package com.vp.collection.framework;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> fruitMap = new TreeMap<>();

        fruitMap.put("banana",15);
        fruitMap.put("mango",10);
        fruitMap.put("orage",14);
        fruitMap.put("apple",25);

        System.out.println(fruitMap);

//        System.out.println(fruitMap.firstKey());
//        System.out.println(fruitMap.lastKey());
//        System.out.println(fruitMap.firstEntry());
//        System.out.println(fruitMap.lastEntry());
//        System.out.println(fruitMap.higherKey("banana"));
//        System.out.println(fruitMap.higherEntry("banana"));
//        System.out.println(fruitMap.lowerKey("apple"));
//        System.out.println(fruitMap.ceilingEntry("banana"));
//        System.out.println(fruitMap.ceilingEntry("bananac"));
        System.out.println(fruitMap.floorKey("banana"));



    }
}
