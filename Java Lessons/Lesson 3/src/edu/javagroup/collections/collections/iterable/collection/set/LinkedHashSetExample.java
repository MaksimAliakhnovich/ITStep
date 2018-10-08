package edu.javagroup.collections.collections.iterable.collection.set;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public void getExample() {

//        Collection<String> linkedHashSet = new LinkedHashSet<>();
//        Set<String> linkedHashSet = new LinkedHashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Word 1");
        linkedHashSet.add("Word 5");
        linkedHashSet.add("Word 5");
        linkedHashSet.add("Word 3");
        linkedHashSet.add("Word 2");
        linkedHashSet.add("Word 1");
        linkedHashSet.add("Word 4");

        linkedHashSet.forEach(System.out::println);
    }
}
