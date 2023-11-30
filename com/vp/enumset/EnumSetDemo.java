package com.vp.enumset;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class EnumSetDemo {
    public static void main(String[] args) {
//        Set<Size> sizes = new HashSet<>();
//        sizes.add(Size.SMALL);
//        sizes.add(Size.MEDIUM);
//        sizes.add(Size.LARGE);
//        sizes.add(Size.EXTRALARGE);
//        System.out.println(Size.getAll());
//        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
//        System.out.println(sizes);

//        EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);
//        System.out.println(sizes1);

//        EnumSet<Size> range = EnumSet.range(Size.MEDIUM, Size.LARGE);
//        System.out.println(range);

        EnumSet<Size> range = EnumSet.of(Size.MEDIUM, Size.XLL);
        System.out.println(range);



    }
}
