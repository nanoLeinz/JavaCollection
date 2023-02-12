package id.nano.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.addAll(List.of("nano","niko","leinza"));
        System.out.println(stringCollection.remove("nano"));
        System.out.println(stringCollection.contains("leinza" +
                "" +
                ""));
        for (var val : stringCollection
             ) {
            System.out.println(val);
        }

    }
}
