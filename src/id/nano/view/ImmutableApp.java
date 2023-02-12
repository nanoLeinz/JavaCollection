package id.nano.view;

import java.util.Collections;
import java.util.List;

public class ImmutableApp {

    List<Integer> integer = Collections.singletonList(2);
    List<String> empty = Collections.emptyList();
    List<Integer> fix = List.of(1,2,3,54,1,3,4,5,1,3);

}
