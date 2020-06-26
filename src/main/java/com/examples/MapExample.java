package com.examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    Map<Integer, String> monthMap = new HashMap<Integer, String>();

    public void demoAdd(){

        monthMap.put(new Integer(1), new String("January"));
        monthMap.put(new Integer(2), "February");

//        monthMap.size();
//
//        String monthName = monthMap.get(new Integer(1));

    }
}
