package com.vp.collection.framework;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectioinDemo {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        //Add element
        nameList.add("Vutha");
        nameList.add("Tikun");
        nameList.add("Seyma");
        nameList.add("Sokcheng");
        nameList.add("Vp");
//        System.out.println(nameList);

        //Access element
        String name = nameList.get(1);
//        System.out.println(name);

        //Update element
        nameList.set(2,"Tikun");
//        System.out.println(nameList);

        //Remove element
        nameList.remove(4);
//        System.out.println(nameList);
//        System.out.println(nameList.size());

        //Sort element

        Comparator<String> comparatorASC = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        nameList.sort( comparatorASC);
//        System.out.println(nameList);

        boolean exist = nameList.contains("Tikun1");
//        System.out.println(exist);

//        System.out.println(nameList.indexOf("Tikun"));

//        for (int i = 0; i < nameList.size(); i++) {
//            System.out.println(i + " => "+ nameList.get(i));
//        }

        for (String name1 :
                nameList) {
            System.out.println(name1);
        }


    }

}
