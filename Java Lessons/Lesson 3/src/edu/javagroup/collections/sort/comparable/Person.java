package edu.javagroup.collections.sort.comparable;

public class Person implements Comparable {

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

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + age;
    }

    @Override
    public int compareTo(Object obj) {

        Person person = (Person) obj;

        int result = 0;

        result = lastName.compareTo(person.lastName);
        if (result != 0) {
            return result;
        }

        result = firstName.compareTo(person.firstName);
        if (result != 0) {
            return result;
        }

        result = age - person.age;
        if (result != 0) {
            return result / Math.abs(result);
        }

        return 0;
    }
}