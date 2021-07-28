package Maps;
import java.util.Collections;
import java.util.HashMap;

public class ExercizeMap {
    public static void main(String[] args) {
        HashMap<String, String> brazilStates = new HashMap<>();

/*        Ver como fazer a leitura de um arquivo csv e gravar num HashMap */
//        Data insertion
        brazilStates.put("AC", "Acre");
        brazilStates.put("AP", "Amapá");
        brazilStates.put("RR", "Roraima");
        brazilStates.put("RN", "Rio Grande do Norte");
        brazilStates.put("RO", "Rondônia");
        brazilStates.put("PA", "Pará");
        brazilStates.put("PE", "Pernambuco" );
        brazilStates.put("BA", "Bahia");
        brazilStates.put("CE", "Ceará");
        brazilStates.put("PB", "Paraíba");
        brazilStates.put("SP", "São Paulo");
        brazilStates.put("RJ", "Rio de Janeiro");
        brazilStates.put("MG", "Minas Gerais");
        brazilStates.put("ES", "Espírito Santo");
        brazilStates.put("SC", "Santa Catarina");
        brazilStates.put("RS", "Rio Grande do Sul");
        brazilStates.put("PR", "Paraná");
        brazilStates.put("GO", "Goiás");
        brazilStates.put("MS", "Mato Grosso do Sul");
        brazilStates.put("MT", "Mato Grosso");
        brazilStates.put("TO", "Tocantins");
        brazilStates.put("PI", "Piauí");
        brazilStates.put("SE", "Sergipe");
        brazilStates.put("AL", "Alagoas");
        brazilStates.put("MA", "Maranhão");
        brazilStates.put("AM", "Amazonas");
        System.out.println(brazilStates);

//        Removal of MG State
        brazilStates.remove("MG");
        System.out.println(brazilStates);

        brazilStates.put("DF", "Distrito Federal");

//        Check the Map size
        int brSize = brazilStates.size();
        System.out.println(brSize);

//      Removal of MS using the value
        brazilStates.remove("Mato Grosso do Sul");
        System.out.println(brazilStates);

//      Show each State with the format STATE NAME(STATE ACRONYM)
        for (String st :
                brazilStates.keySet()) {
            System.out.println(brazilStates.get(st) + "(" + st + ")");
        }

//        Check is SC is in the Map, by the acronym
        boolean containStaCata = brazilStates.containsKey("SC");
        System.out.println(containStaCata);

//        Check if MA is in the Map, by the name
        boolean containMaranhao = brazilStates.containsValue("Maranhão");
        System.out.println(containMaranhao);


    }
}
