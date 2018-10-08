package edu.javagroup.collections.collections.iterable.collection.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public void getExample() {

        System.out.println("HashSet example");

//        Collection<String> hashSet = new HashSet<>();
//        Set<String> hashSet = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Word 3");
        hashSet.add("Word 2");
        hashSet.add("Word 4");
        hashSet.add("Word 4");
        hashSet.add("Word 4");
        hashSet.add("Word 1");

//        Iterator comparator = hashSet.comparator();
//        while (comparator.hasNext()) {
//            System.out.println(comparator.next());
//        }

        for (String s : hashSet) {
            System.out.println(s);
        }

//        hashSet.forEach(System.out::println);

        // покажем хэшкод, чтобы понять почему вывод отсортировался именно таким образом
        System.out.println("Word 1 (hashCode) = " + "Word 1".hashCode());
        System.out.println("Word 2 (hashCode) = " + "Word 2".hashCode());
        System.out.println("Word 3 (hashCode) = " + "Word 3".hashCode());
        System.out.println("Word 4 (hashCode) = " + "Word 4".hashCode());
    }
}
