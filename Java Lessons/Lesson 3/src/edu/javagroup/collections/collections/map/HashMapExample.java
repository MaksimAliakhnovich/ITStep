package edu.javagroup.collections.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    /**
     * @see "https://stackoverflow.com/questions/46898/how-to-efficiently-iterate-over-each-entry-in-a-map"
     */
    public void getExample() {

        System.out.println("HashMap example");

//        Map<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Key 4", "Word 4");
        hashMap.put("Key 3", "Word 3");
        hashMap.put("Key 2", "Word 2");
        hashMap.put("Key 1", "Word 1");

//        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> pair = iterator.next();
//            System.out.println("key - " + pair.getKey() + ", value - " + pair.getValue());
//        }

        for (Map.Entry<String, String> map : hashMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

//        hashMap.forEach((key, value) -> System.out.println(key + " " + value));

        // покажем хэшкод, чтобы понять почему вывод отсортировался именно таким образом
        System.out.println("Key 1 (hashCode) = " + "Key 1".hashCode());
        System.out.println("Key 2 (hashCode) = " + "Key 2".hashCode());
        System.out.println("Key 3 (hashCode) = " + "Key 3".hashCode());
        System.out.println("Key 4 (hashCode) = " + "Key 4".hashCode());
    }
}
