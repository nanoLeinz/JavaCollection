package id.nano.view;

import id.nano.model.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person nano = new Person("nano");
        nano.addHobby("turu");
        nano.addHobby("sleep");
        try {
            doIt(nano.getHobbies());
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        for (var val : nano.getHobbies()
        ) {
            System.out.println(val);
        }
    }

    public static void doIt(List<String> hobbies){
        hobbies.add("fly");

    }

}
