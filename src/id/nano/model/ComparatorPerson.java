package id.nano.model;

import java.util.Comparator;

public class ComparatorPerson implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
