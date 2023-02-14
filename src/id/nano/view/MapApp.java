package id.nano.view;

import netscape.javascript.JSObject;

import java.util.*;

public class MapApp {
    public static void main(String[] args) {

        Map<String, Integer> names = new LinkedHashMap<>();
        names.put("niko", 23);
        names.put("nano", 43);
        names.put("leinza", 21);
        names.put("Lynxed", 27);
        names.put("niko", 3234);

        System.out.println(Objects.requireNonNull(names.get("niko")));
//        System.out.println(names.get("niko"));

        Set<String> strings = names.keySet();
        for (var name : strings
        ) {
            System.out.println(name);
        }

        //SortedMap

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        SortedMap<Integer,String> sortedMap = new TreeMap<>(comparator.reversed());

        sortedMap.put(1,"nano");
        sortedMap.put(9,"nano");
        sortedMap.put(7,"nano");
        sortedMap.put(4,"nano");
        sortedMap.put(2,"nano");
        sortedMap.put(5,"nano");

        for (var key:sortedMap.keySet()){
            System.out.println(key);
        }

        //immutable SortedMap
        SortedMap<Integer, String> unmodifiableSortedMap = Collections.unmodifiableSortedMap(sortedMap);
//        unmodifiableSortedMap.put(5,"2");

        NavigableMap<Integer,String> navMap = new TreeMap<>(comparator);

        navMap.put(5,"nano");
        navMap.put(1,"nano");
        navMap.put(9,"nano");
        navMap.put(7,"nano");
        navMap.put(4,"nano");
        navMap.put(2,"nano");
        System.out.println("==========================");
        System.out.println(navMap.tailMap(6,false));
        System.out.println(navMap.floorEntry(6));
        System.out.println(navMap.lowerKey(3));

        // untuk reverse
        NavigableMap<Integer, String> integerStringNavigableMap = navMap.descendingMap();

        //immutable
        NavigableMap<Integer, String> navigableMap = Collections.unmodifiableNavigableMap(navMap);

        //entry map
        Set<Map.Entry<Integer, String>> entries = navMap.entrySet();

        System.out.println(navMap);
        System.out.println(entries.contains("4=nano"));


    }

}
