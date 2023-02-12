package id.nano.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private List<String> hobbies;

    public void addHobby(String hobby) {
        this.hobbies.add(hobby);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }
}
