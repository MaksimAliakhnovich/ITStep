package edu.javagroup.collections.collections.iterable.collection.set;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetExample {

    public void getExample() {

        System.out.println("TreeSet example");

//        Collection<String> treeSet = new TreeSet<>();
//        Set<String> treeSet = new TreeSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Word 2");
        treeSet.add("Word 1");
        treeSet.add("Word 4");
        treeSet.add("Word 4");
        treeSet.add("Word 4");
        treeSet.add("2 Word");
        treeSet.add("1 Word");
        treeSet.add("Word 3");

//        Iterator comparator = treeSet.comparator();
//        while (comparator.hasNext()) {
//            System.out.println(comparator.next());
//        }

        for (String s : treeSet) {
            System.out.println(s);
        }

//        treeSet.forEach(System.out::println);
    }
}
