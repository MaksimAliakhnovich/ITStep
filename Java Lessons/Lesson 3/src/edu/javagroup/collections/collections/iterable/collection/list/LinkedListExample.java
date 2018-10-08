package edu.javagroup.collections.collections.iterable.collection.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public void getExample() {

        System.out.println("LinkedList example");

//        Collection<String> linkedList = new LinkedList<>();
//        List<String> linkedList = new LinkedList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Value 1");
        linkedList.add("Value 2");
        linkedList.add("Value 3");

//        Iterator iterator = linkedList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (String s : linkedList) {
            System.out.println(s);
        }

        System.out.println("First element = " + linkedList.getFirst());
        System.out.println("Last element = " + linkedList.getLast());

//        linkedList.forEach(System.out::println);
    }
}
