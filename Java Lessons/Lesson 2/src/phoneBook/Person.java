package phoneBook;

import java.util.List;

/**
 * Created by Student on 20.12.2017.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private List<Phone> phones;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, List<Phone> phones) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phones = phones;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        String phoneList = "";
        for (Phone phone : phones) {
            phoneList = phoneList + " " + phone + "\n";
        }
        return "Человек: " +
                lastName + " " +
                firstName + " " +
                age + " " +
                "\n Телефон \n" +
                phoneList;
    }
}
