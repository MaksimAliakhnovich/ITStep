package edu.javagroup.collections.collections.iterable.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public void getExample() {

        System.out.println("ArrayList example");

//        Collection<String> arrayList = new ArrayList<>();
//        List<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Value 1");
        arrayList.add("Value 2");
        arrayList.add("Value 3");

//        Iterator comparator = arrayList.iterator();
//        while (comparator.hasNext()) {
//            System.out.println(comparator.next());
//        }

        for (String s : arrayList) {
            System.out.println(s);
        }

        arrayList.forEach(System.out::println);
//        arrayList.forEach(value -> System.out.println(value));
    }
}
