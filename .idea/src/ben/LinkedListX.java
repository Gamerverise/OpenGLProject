package ben;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListX<T> extends LinkedList<T> {

    void add(T... args) {
        addAll(Arrays.asList(args));
    }
}
