package Javadoc;

import java.util.*;

public class NameSort {
    public static void main(String[] args) {
        Name nameArray[] = {
                new Name("Thiago", "Geronimo"),
                new Name("Tales", "Geronimo"),
                new Name("Chris", "Geronimo"),
                new Name("Tom", "Rich")
        };

        List<Name> names = Arrays.asList(nameArray);
        Collections.sort(names);
        System.out.println(names);
    }
}
