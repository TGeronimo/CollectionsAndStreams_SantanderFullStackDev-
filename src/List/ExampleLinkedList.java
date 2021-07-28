package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

//        peek() returns the first element os the list and if it not exists, returns 'null'.
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        String primeiroClienteOuErro =  filaBanco.element();
        System.out.println(primeiroClienteOuErro);

//        Limpa a List para mostrar que element() lança uma exceção (NoSuchElementException), caso a List esteja vazia.
//        filaBanco.clear();
//        String primeiroClienteOuErro =  filaBanco.element();
//        System.out.println(primeiroClienteOuErro);

        for (String cliente :
             filaBanco) {
            System.out.println("Elemento: " + cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.println("---> " + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Thiago");
        System.out.println(filaBanco); // Verifica que o novo nome entrou no final da lista.

    }
}
