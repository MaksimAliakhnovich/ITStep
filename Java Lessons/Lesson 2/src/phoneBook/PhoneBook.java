package phoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Student on 20.12.2017.
 */
public class PhoneBook {

    public void getPhoneBook() {
        List<Person> personList = new ArrayList<>(getPersons());
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Максим1", "Алехнович3", 10, getPhones()));
        persons.add(new Person("Максим2", "Алехнович2", 20, getPhones()));
        persons.add(new Person("Максим4", "Алехнович1", 30, getPhones()));
        persons.add(new Person("Максим3", "Алехнович1", 40, getPhones()));
        Collections.sort(persons,new SortByLastName()
                        .thenComparing(new SortByFirstName())
                        .thenComparing(new SortByAge()));
        return persons;
    }

    private List<Phone> getPhones() {

        Random random = new Random();
        int min = 1000000;
        int max = 9999999;
        int phoneNumber;

        List<Phone> phones = new ArrayList<>();

        boolean mobile = true;

        for (int f = 100; f < 104; f++) {
            phoneNumber = random.nextInt(max - min) + min;
            phones.add(new Phone(mobile,
                    "личный",
                    String.valueOf(f),
                    String.valueOf(phoneNumber)));
            mobile = !mobile;
        }
        Collections.sort(phones, new SortByPhoneNumber());
        return phones;
    }
}
