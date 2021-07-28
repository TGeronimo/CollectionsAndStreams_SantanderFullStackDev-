package Comparator;

import java.util.Comparator;

public class EstudanteComparator implements Comparator<Estudante> {

//    Sobrescreve o método compare() para implementar a regra de ordenação, no caso, decrescente pela idade.
    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }
}
