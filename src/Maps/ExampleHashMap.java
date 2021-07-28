package Maps;

import java.util.HashMap;
import java.util.Map;


// Assistir a aula novamente e digitar o código de exemplo

public class ExampleHashMap {
    public static void main(String[] args) {

//        Map permite passar uma List<> para o argumento de valor (ex: leitura de um arquivo .csv).
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanhã", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);
        System.out.println(campeoesMundialFifa);

//        Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

//        Retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

//        Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        campeoesMundialFifa.remove("França");

        System.out.println(campeoesMundialFifa.containsKey("França"));

//        Retorna se existe alguma seleção hexacampeã
        System.out.println(campeoesMundialFifa.containsValue(6));

        System.out.println(campeoesMundialFifa.size());

        for (Map.Entry<String, Integer> entry: campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        for (String key : campeoesMundialFifa.keySet()) {
            System.out.println(key + " -- " + campeoesMundialFifa.get(key));
        }


    }
}
