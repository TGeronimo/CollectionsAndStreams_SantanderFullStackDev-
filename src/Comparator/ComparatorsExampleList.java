package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("--- ORDEM DE INSERÇÃO ---");
        System.out.println(estudantes);

//        Lambda definindo a regra de ordenação
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println("\n--- ORDEM NATURAL/CRESCENTE DOS NÚMEROS - IDADE ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println("\n--- ORDEM DECRESCENTE DOS NÚMEROS - IDADE ---");
        System.out.println(estudantes);

//        Regra de ordenação definida por comparingInt().
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("\n--- ORDEM CRESCENTE DOS NÚMEROS - IDADE (Comparator.compareInt()) ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

        System.out.println("\n--- ORDEM DECRESCENTE DOS NÚMEROS - IDADE (Comparator.compareInt().reversed()) ---");
        System.out.println(estudantes);

//        Regra de ordenação definida por Collection.sort()
        Collections.sort(estudantes);
        System.out.println("\n--- ORDEM CRESCENTE DOS NÚMEROS - IDADE (Comparable) ---");
        System.out.println(estudantes);

//        Neste caso, a classe que implementa Comparator será utilizada como regra na ordenação.
//        Método sort() é sobrecarregado.
        Collections.sort(estudantes, new EstudanteComparator());
        System.out.println("\n--- ORDEM DECRESCENTE DOS NÚMEROS - IDADE (Comparable) ---");
        System.out.println(estudantes);

    }
}
