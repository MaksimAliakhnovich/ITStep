package edu.javagroup.collections.sort.comparator;

import edu.javagroup.collections.sort.comparator.example1.Person;
import edu.javagroup.collections.sort.comparator.example1.PersonSortByAge;
import edu.javagroup.collections.sort.comparator.example1.PersonSortByFirstName;
import edu.javagroup.collections.sort.comparator.example1.PersonSortByLastName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonSortComparator2 {

    private Collection<Person> getList() {

        Collection<Person> personList = new ArrayList<>();

        personList.add(new Person("Завьялов", "Артур", 25));
        personList.add(new Person("Антоненко", "Максим", 34));
        personList.add(new Person("Богданский", "Валерий", 24));
        personList.add(new Person("Сорокин", "Максим", 24));
        personList.add(new Person("Липгарт", "Дмитрий", 20));
        personList.add(new Person("Цакунов", "Андрей", 26));
        personList.add(new Person("Кравцов", "Александр", 29));
        personList.add(new Person("Линкевич", "Наталья", 17));
        personList.add(new Person("Липгарт", "Дмитрий", 33));
        personList.add(new Person("Богданский", "Валентин", 20));
        personList.add(new Person("Василец", "Максим", 19));
        personList.add(new Person("Антоненко", "Максим", 25));
        personList.add(new Person("Цакунов", "Даниил", 16));
        personList.add(new Person("Петроченко", "Анна", 17));
        personList.add(new Person("Липгарт", "Олег", 27));
        personList.add(new Person("Завьялов", "Андрей", 25));
        personList.add(new Person("Завьялов", "Константин", 33));

        return personList;
    }

    public void sortByLastName() {

        List<Person> list = new ArrayList<>(getList());
        Collections.sort(list, new PersonSortByLastName());
        list.forEach(System.out::println);
        for (Person person : list) {
            System.out.printf("%-12s%-12s%-5s%n",
                    person.getLastName(),
                    person.getFirstName(),
                    person.getAge());
        }
    }

    public void sortByFirstName() {

        List<Person> list = new ArrayList<>(getList());
        Collections.sort(list, new PersonSortByFirstName());
//        list.forEach(System.out::println);
        for (Person person : list) {
            System.out.printf("%-12s%-12s%-5s%n",
                    person.getLastName(),
                    person.getFirstName(),
                    person.getAge());
        }
    }

    public void sortByAge() {

        List<Person> list = new ArrayList<>(getList());
        Collections.sort(list, new PersonSortByAge());
//        list.forEach(System.out::println);
        for (Person person : list) {
            System.out.printf("%-12s%-12s%-5s%n",
                    person.getLastName(),
                    person.getFirstName(),
                    person.getAge());
        }
    }

    public void sortByAllFields() {

        List<Person> list = new ArrayList<>(getList());
        Collections.sort(list, new PersonSortByLastName().thenComparing(
                new PersonSortByFirstName()).thenComparing(
                new PersonSortByAge()));
//        list.forEach(System.out::println);
        for (Person person : list) {
            System.out.printf("%-12s%-12s%-5s%n",
                    person.getLastName(),
                    person.getFirstName(),
                    person.getAge());
        }
    }
}
