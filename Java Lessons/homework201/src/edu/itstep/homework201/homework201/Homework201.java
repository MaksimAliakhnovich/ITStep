package edu.itstep.homework201.homework201;

import java.util.*;

public class Homework201 {

    /**
     * создайте коллекцию на основе интерфейса List
     * заполните ее значениями
     * осуществите вывод элементов коллекции четырьмя разными способами
     */
    public void task01() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        for (int i : list) {
            System.out.println(list.get(i));
        }

        System.out.println();

        System.out.println(list);

        System.out.println();

        list.forEach(value -> System.out.println(value));

        System.out.println();

        list.forEach(System.out::println);

    }

    /**
     * создайте коллекцию на основе класса ArrayList
     * заполните ее значениями
     * осуществите вывод элементов коллекции четырьмя разными способами
     */
    public void task02() {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        for (int i : list) {
            System.out.println(list.get(i));
        }

        System.out.println();

        System.out.println(list);

        System.out.println();

        list.forEach(value -> System.out.println(value));

        System.out.println();

        list.forEach(System.out::println);

    }

    /**
     * массив необходимо преобразовать в коллекцию
     */
    public void task03() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i : array) {
            intArray.add(i);
        }

        System.out.println(intArray);
    }

    /**
     * необходимо создать коллекцию слов
     */
    public void task04() {
        String line = "edu itstep homework201 Main";

        ArrayList<String> wordArray = new ArrayList<>();

        for (String word : line.split(" ")) {
            wordArray.add(word);
        }

        System.out.println(wordArray);
    }

    /**
     * необходимо создать коллекцию слов
     */
    public void task05() {
        String line = "edu itstep homework201 homework201 Homework201";

        TreeSet<String> wordArray = new TreeSet<>();

        for (String word : line.split(" ")) {
            wordArray.add(word);
        }

        wordArray.forEach(System.out::println);

    }

    /**
     * у вас есть массив, необходимо перевести его в коллекцию и найти
     * минимальное и максимальное число
     *
     * @see "https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#sort-java.util.List-"
     */
    public void task06() {
        Integer[] array = {3, 6, 9, 2, 5, 8, 1, 4, 7, 0};
        List list = Arrays.asList(array);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

    }

    /**
     * у вас есть массив, необходимо перевести его в коллекцию List
     * и найти минимальное и максимальное число используя Set
     *
     * @see "http://spec-zone.ru/RU/Java/Docs/8/api/java/util/TreeSet.html"
     * @see "https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html"
     */
    public void task07() {
        Integer[] array = {3, 6, 9, 2, 5, 8, 1, 4, 7, 0};
        List list = Arrays.asList(array);
        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println(set.first());
        System.out.println(set.last());
    }

    /**
     * одной строкой кода, заполните коллекцию List элементами массива
     * второй строкой кода, организуйте вывод
     */
    public void task08() {
        List<Integer> list = new ArrayList<>();
//      какого массива

    }

    /**
     * создайте коллекцию List заполните ее числами с повторами
     * отсортируйте, и преобразуйте в Set
     */
    public void task09() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.sort(list);
        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);

    }

    /**
     * создайте очередь Кью
     * заполните элементами, добавьте элемент, удалите элемент
     */
    public void task10() {
        Queue<String> queue = new LinkedList<>();
        queue.add("привет1");
        queue.offer("привет2");
        queue.offer("привет3");
        queue.add("привет4");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }

    /**
     * создайте очередь Дэк
     * заполните элементами, повлияйте на первый и последний элементы
     */
    public void task11() {
        Deque<String> deque = new LinkedList<>();
        deque.add("привет2");
        deque.offer("привет3");
        deque.offer("привет4");
        deque.addFirst("привет1");
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);
    }

    /**
     * 1. нам нужна коллекция, которая принимает только уникальные значения, сортировка при выводе не важна
     * 2. нам нужна коллекция, которая принимает только уникальные значения и сортирует элементы
     * 3. нам нужна коллекция, которая принимает только уникальные значения и сохраняет порядок ввода
     * в каждом случае, доказать это выводом
     */
    public void task12() {
        Set<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);

        Set<Integer> set1 = new TreeSet();
        set1.add(2);
        set1.add(2);
        set1.add(1);
        System.out.println(set1);

        Set<Integer> set3 = new LinkedHashSet();
        set3.add(3);
        set3.add(1);
        set3.add(2);
        set3.add(3);
        System.out.println(set3);
    }

    /**
     * доказать, что ArrayList работает медленее LinkedList
     * при вставке между элементами, вставку производить исключительно в середину
     * если на момент вставки число элементов
     * четное - в середину коллекции
     * не четное - поочередно левее и правее центрального элемента
     * количество итераций выберите сами
     */
    public void task13() {

        Long timeStart11 = System.nanoTime();
        // ваш код с ArrayList
        Long timeFinish12 = System.nanoTime();

        Long timeStart21 = System.nanoTime();
        // ваш код с LinkedList
        Long timeFinish22 = System.nanoTime();

        // вычисление времени
    }

    /**
     * 1. нам нужна коллекция, которая принимает только уникальные значения ключа, сортировка при выводе не важна
     * 2. нам нужна коллекция, которая принимает только уникальные значения ключа и сортирует элементы
     * 3. нам нужна коллекция, которая принимает только уникальные значения ключа и сохраняет порядок ввода
     * в каждом случае, доказать это выводом
     */
    public void task14() {

    }

    /**
     * создайте карту, заполните тремя элементами (ключ + значение)
     * запишите все ключи в одну коллекцию, а значения в другую (2 строки кода)
     * организуйте вывод (две строки кода)
     */
    public void task15() {

    }

    /**
     * создайте очередь на основе класса
     * заполните 20 элементами
     * затем постоянно удаляя первый и последний элемент,
     * добейтесь того, чтобы коллекция стала пустой, сообщите об этом
     */
    public void task16() {

    }
}
