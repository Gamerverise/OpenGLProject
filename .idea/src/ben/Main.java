package ben;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World");

        LinkedListX<Integer> ints = new LinkedListX<>();
        LinkedListX<String> strings = new LinkedListX<>();
        LinkedListX<LinkedListX> list_of_lists = new LinkedListX<>();

        Integer one = 10;
        Integer two = 16;
        Integer three = 22;
        Integer four = 86;

        ints.add(one, two, three, four);

        String a = "hello";
        String b = "how";
        String c = "are";
        String d = "you?";

        strings.add(a, b, c, d);

        list_of_lists.add(ints, strings);

        for (int i = 0; i < ints.size(); i++) {
            Integer j = ints.get(i);
            System.out.println(j);
        }
    }
}
