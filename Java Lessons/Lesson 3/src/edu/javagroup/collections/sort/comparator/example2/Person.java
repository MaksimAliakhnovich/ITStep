package edu.javagroup.collections.sort.comparator.example2;

import java.util.Comparator;

public class Person {

    private String lastName;
    private String firstName;
    private int age;

    public Person() {
        //
    }

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    class PersonSortByLastName implements Comparator<Person> {

        @Override
        public int compare(Person person1, Person person2) {

            return person1.getLastName().compareTo(person2.getLastName());
        }
    }

    class PersonSortByFirstName implements Comparator<Person> {

        @Override
        public int compare(Person person1, Person person2) {

            return person1.getFirstName().compareTo(person2.getFirstName());
        }
    }

    class PersonSortByAge implements Comparator<Person> {

        @Override
        public int compare(Person person1, Person person2) {

            return person1.getAge() - person2.getAge();
        }
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + age;
    }
}