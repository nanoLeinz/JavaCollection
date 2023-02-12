package id.nano.view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(10);
//        List<String> strings = new LinkedList<>();
        strings.addAll(List.of("nano","niko","leinza"));

        strings.remove(1);
        System.out.println(strings.get(1));
    }
}
