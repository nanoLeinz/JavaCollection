package id.nano.view;

import id.nano.model.ComparatorPerson;
import id.nano.model.Person;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> names = new TreeSet<>(new ComparatorPerson());
        names.add(new Person("nano"));
        names.add(new Person("niko"));
        names.add(new Person("nano"));
        names.add(new Person("lano"));

        for (var name : names) {
            System.out.println(name.getName());
        }

        SortedSet<Person> people = Collections.unmodifiableSortedSet(names);


    }


}
