package Set;

import java.util.LinkedHashSet;

public class ExercizeSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numsInts = new LinkedHashSet<>();

//        Add 5 numbers to the Set
        numsInts.add(3);
        numsInts.add(88);
        numsInts.add(20);
        numsInts.add(44);
        numsInts.add(3); // don't return an error but instead don't add a duplicated value, so the set still has only 4 elements.
        System.out.println(numsInts);

//        Show each element of the set on console
        for (Integer i:
             numsInts) {
            System.out.println(i);
        }

//        Remove the first element of the set
        numsInts.remove(3);
        System.out.println(numsInts);

//        Add element 23 to the set
        numsInts.add(23);

//        Check the size of the set
        System.out.println(numsInts.size());

//        Check if the set is empty
        System.out.println(numsInts.isEmpty());
    }
}
