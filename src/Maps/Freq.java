package Maps;

import java.util.*;


// Exemplo do Java Tutorial ==> https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html
public class Freq {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();

        // Initialize frequency table from command line
        for (String a : args) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1); //*
        }
        // * Isto é um tipo de if(). Caso (freq == null) seja verdadeiro, o valor após '?' é atribuído à freq,
        // caso contrário, soma 1 à freq.

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}
