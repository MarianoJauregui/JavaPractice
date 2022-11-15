package generalPractices.codewars.kyu7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
 */
public class ListFiltering {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add(3);
        objects.add("Hello");
        objects.add("Asd");
        objects.add(5);
        objects.add("ASD!");
        objects.add("ÑacaÑaca");
        objects.add(123);
        objects.add("alsdfjalskd");
        objects.add("ASDFFFF");

        System.out.println(filterList(objects));
    }
    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out

        return list.stream()
                .filter(obj -> obj instanceof Integer)
                .collect(Collectors.toList());
    }
}
