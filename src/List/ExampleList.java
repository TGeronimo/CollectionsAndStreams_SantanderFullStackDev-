package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ExampleList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

//        add() method
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

//        set() method
        nomes.set(2, "Larissa"); // set() altera uma string em uma posição.
        System.out.println(nomes); // Show the list in the order it was created.
        Collections.sort(nomes); // Alphabetical order
        nomes.set(2, "Wesley");

//        remove() method
        System.out.println(nomes);
        nomes.remove(4);
        System.out.println(nomes);
        nomes.remove("Wesley");
        System.out.println(nomes);

//        get() method
        String nome = nomes.get(2);
        System.out.println(nome);

//        indexOf() method
        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);

//        size() method
        int tamanho = nomes.size();
        System.out.println(tamanho);

//        contains() method
        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);
        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

//        isEmpty() method
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

//        using foreach to run through ArrayList elements
        for (String nomeDoItem:nomes) {
            System.out.println("---> " + nomeDoItem);
        }

//        Use of the object Iterator and while to run through the List<>
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("------> " + iterator.next());
        }

//        clear() method
        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

    }
}
