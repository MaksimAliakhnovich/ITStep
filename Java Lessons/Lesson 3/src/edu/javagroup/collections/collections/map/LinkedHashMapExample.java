package edu.javagroup.collections.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public void getExample() {

        System.out.println("LinkedHashMap example");

//        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Key 4", "Value 4");
        linkedHashMap.put("Key 3", "Value 3");
        linkedHashMap.put("Key 2", "Value 2");
        linkedHashMap.put("Key 1", "Value 1");

//        Iterator<Map.Entry<String, String>> comparator = linkedHashMap.entrySet().comparator();
//        while (comparator.hasNext()) {
//            Map.Entry<String, String> pair = comparator.next();
//            System.out.println("key - " + pair.getKey() + ", value - " + pair.getValue());
//        }

        for (Map.Entry<String, String> map : linkedHashMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

//        linkedHashMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
