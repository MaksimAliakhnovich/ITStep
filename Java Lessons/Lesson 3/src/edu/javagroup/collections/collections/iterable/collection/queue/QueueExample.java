package edu.javagroup.collections.collections.iterable.collection.queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {

    public void getExample() {

        System.out.println("Queue example");

        Queue<String> queue = new LinkedList<>();
        // Метод add() может неудачно добавить элемент только с использованием unchecked исключения
        queue.add("Word 1");
        queue.add("Word 2");
        // Метод offer() вставляет элемент в очередь, если это не удалось - возвращает false
        queue.offer("Word 3");
        queue.offer("Word 4");

        queue.forEach(System.out::println);
        System.out.println("---");

        // Методы element() и peek() возвращают (но не удаляют) верхушку очереди
        // element генерирует исключение
        // peek возвращает специальное значение (null)
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println("---");

        queue.forEach(System.out::println);
        System.out.println("---");

        // Методы remove() и poll() удаляют верхушку очереди и возвращают ее
        // когда очередь пустая: метод remove() генерирует исключение
        queue.remove();
        // когда очередь пустая: метод poll() возвращает null
        queue.poll();

        queue.forEach(System.out::println);
    }
}
