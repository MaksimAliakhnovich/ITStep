package edu.javagroup.collections.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public void getExample() {

        System.out.println("TreeMap example");

//        Map<String, String> treeMap = new TreeMap<>();
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Key 4", "Value 4");
        treeMap.put("Key 3", "Value 3");
        treeMap.put("Key 2", "Value 2");
        treeMap.put("Key 1", "Value 1");

//        Iterator<Map.Entry<String, String>> comparator = treeMap.entrySet().comparator();
//        while (comparator.hasNext()) {
//            Map.Entry<String, String> pair = comparator.next();
//            System.out.println("key - " + pair.getKey() + ", value - " + pair.getValue());
//        }

        for (Map.Entry<String, String> map : treeMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

//        treeMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
