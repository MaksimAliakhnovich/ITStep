package edu.javagroup.collections;

import edu.javagroup.collections.collections.iterable.collection.list.ArrayListExample;
import edu.javagroup.collections.collections.iterable.collection.list.LinkedListExample;
import edu.javagroup.collections.collections.iterable.collection.queue.DequeExample;
import edu.javagroup.collections.collections.iterable.collection.queue.QueueExample;
import edu.javagroup.collections.collections.iterable.collection.set.HashSetExample;
import edu.javagroup.collections.collections.iterable.collection.set.LinkedHashSetExample;
import edu.javagroup.collections.collections.iterable.collection.set.TreeSetExample;
import edu.javagroup.collections.collections.map.HashMapExample;
import edu.javagroup.collections.collections.map.TreeMapExample;
import edu.javagroup.collections.collections.map.LinkedHashMapExample;
import edu.javagroup.collections.sort.comparable.PersonSortComparable;
import edu.javagroup.collections.sort.comparator.PersonSortComparator2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {

    public void menu() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean w = true;
        while (w) {
            System.out.println(
                    "0  Exit\n" +
                    "1  ArrayList\n" +
                    "2  LinkedList\n" +
                    "3  HashSet\n" +
                    "4  TreeSet\n" +
                    "5  LinkedHashSet\n" +
                    "6  Queue\n" +
                    "7  Deque\n" +
                    "8  HashMap\n" +
                    "9  TreeMap\n" +
                    "10 LinkedHashMap\n" +
                    "11 Comparable\n" +
                    "12 Comparator (age)\n" +
                    "13 Comparator (firstName)\n" +
                    "14 Comparator (lastName)\n" +
                    "15 Comparator (all fields)");
            System.out.print("Please choose variant: ");

            int menuItem = Integer.parseInt(bufferedReader.readLine());

            if (menuItem == 0) {
                System.exit(0);
            }

            System.out.println("\n--- Example ----------------------------------------------\n");

            switch (menuItem) {
                case 1:
                    ArrayListExample arrayListExample = new ArrayListExample();
                    arrayListExample.getExample();
                    break;
                case 2:
                    LinkedListExample linkedListExample = new LinkedListExample();
                    linkedListExample.getExample();
                    break;
                case 3:
                    HashSetExample hashSetExample = new HashSetExample();
                    hashSetExample.getExample();
                    break;
                case 4:
                    TreeSetExample treeSetExample = new TreeSetExample();
                    treeSetExample.getExample();
                    break;
                case 5:
                    LinkedHashSetExample linkedHashSetExample = new LinkedHashSetExample();
                    linkedHashSetExample.getExample();
                    break;
                case 6:
                    QueueExample queueExample = new QueueExample();
                    queueExample.getExample();
                    break;
                case 7:
                    DequeExample dequeExample = new DequeExample();
                    dequeExample.getExample();
                    break;
                case 8:
                    HashMapExample hashMapExample = new HashMapExample();
                    hashMapExample.getExample();
                    break;
                case 9:
                    TreeMapExample treeMapExample = new TreeMapExample();
                    treeMapExample.getExample();
                    break;
                case 10:
                    LinkedHashMapExample linkedHashMapExample = new LinkedHashMapExample();
                    linkedHashMapExample.getExample();
                    break;
                case 11:
                    PersonSortComparable personSortComparable = new PersonSortComparable();
                    personSortComparable.sortByAllFields();
                    break;
                case 12:
                    PersonSortComparator2 personSortComparator2Age = new PersonSortComparator2();
                    personSortComparator2Age.sortByAge();
                    break;
                case 13:
                    PersonSortComparator2 personSortComparator2Fname = new PersonSortComparator2();
                    personSortComparator2Fname.sortByFirstName();
                    break;
                case 14:
                    PersonSortComparator2 personSortComparator2Lname = new PersonSortComparator2();
                    personSortComparator2Lname.sortByLastName();
                    break;
                case 15:
                    PersonSortComparator2 personSortComparator2All = new PersonSortComparator2();
                    personSortComparator2All.sortByAllFields();
                    break;
                default:
                    System.out.println("Error");
                    w = false;
                    break;
            }
            System.out.println("\n--- Example ----------------------------------------------\n");
        }
    }
}