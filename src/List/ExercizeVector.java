package List;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ExercizeVector {
    public static void main(String[] args) {
        List<String> names = new Vector<>();

//        Add 5 names to the list: Juliana, Pedro, Carlos, Larissa e João.
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");
        System.out.println(names);

//        Run through the Vector and show each name on it
        for (String nome:names) {
            System.out.println(nome);
        }

//      Replace Carlos by Roberto
        names.remove(2);
        names.add(2,"Roberto");
        System.out.println(names);

//      Return the name in the position 1
        System.out.println(names.get(1));

//      Remove the name on position 4
        names.remove(4);
        System.out.println(names);

//      Show how many names are in the list
        System.out.println(names.size());

//      Is Juliano in this list?
        System.out.println(names.contains("Juliano"));

//        Create a new list with the names Ismael and Rodrigo
        List<String> newNames = new Vector<>();
        newNames.add("Rodrigo");
        newNames.add("Ismael");

//        Insert the new names into the old list names (first option)
//        names.add(newNames.get(0));
//        names.add(newNames.get(1));
//        System.out.println(names);

//        Insert the new names into the old list names (second option)
        names.addAll(newNames);
        System.out.println(names);

//        Sort the Vector by alphabetical order
        Collections.sort(names);
        System.out.println(names);

        boolean estaVazio =  names.isEmpty();
        System.out.println(estaVazio);
    }
}
