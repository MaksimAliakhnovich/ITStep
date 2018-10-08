package phoneBook;

import java.util.Comparator;

/**
 * Created by Student on 20.12.2017.
 */
public class SortByPhoneNumber implements Comparator<Phone>{

    @Override
    public int compare(Phone phone1, Phone phone2) {
        return phone1.getNumber().compareTo(phone2.getNumber());
    }
}
