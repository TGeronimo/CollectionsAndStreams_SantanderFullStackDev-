package Set;

import java.util.TreeSet;
import java.util.Iterator;

public class ExampleTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        System.out.println(treeCapitais);

//        Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

//        Retorna a última capital na base da árvore
        System.out.println(treeCapitais.last());

//        Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

//        Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.pollFirst());

        System.out.println(treeCapitais.pollLast());
        
        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String cidade:
             treeCapitais) {
            System.out.println(cidade);
        }

    }
}
