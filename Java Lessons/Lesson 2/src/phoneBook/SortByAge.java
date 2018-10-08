package phoneBook;

import java.util.Comparator;

/**
 * Created by Student on 20.12.2017.
 */
public class SortByAge implements Comparator<Person> {


    @Override
    public int compare(Person person1, Person person2) {
        return person1.getAge() - person2.getAge();
    }
}
