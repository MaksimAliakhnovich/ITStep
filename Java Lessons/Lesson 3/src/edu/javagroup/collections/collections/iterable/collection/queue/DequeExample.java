package edu.javagroup.collections.collections.iterable.collection.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

    public void getExample() {

        Deque<String> deque = new LinkedList<>();
        deque.add("Word 2");
        // вставка в начало
        deque.addFirst("Word 1");
        deque.offer("Word 3");
        // вставка в конец
        deque.addLast("Word 4");

        deque.forEach(System.out::println);
        System.out.println("---");

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println("---");

        // удаляет и возвращает взятый элемент (первый/последний)
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println("---");

        deque.forEach(System.out::println);
    }
}
