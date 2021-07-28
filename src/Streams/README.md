# Stream API
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/package-summary.html#StreamOps
___
- Manipulação de coleções com o paradigma funcional de forma paralela.
- Imutável: não altera a coleção de origem; sempre cria uma
nova coleção.
  
## Principais funcionalidades
### Mapping
Retorna uma coleção com o mesmo tamanho da origem com os 
elementos alterados.
### Filtering
Retorna uma coleção igual ou menor que a coleção de origem,
com os elementos intactos.
### ForEach
Executa uma determinada lógica para cada elemento, retornando
nada. 
### Peek
Executa uma determinada lógica para cada elemento, retornando
a própria coleção.
### Counting
Retorna um inteiro que representa a contagem de elementos.
### Grouping
Retorna uma coleção agrupada de acordo com as regras
definidas.

---
## Exercícios
Utilizando uma lista de objetos complexos (carros antigos), realize 
as seguintes operações:
- Transforme cada objeto em uma string com os atributos do objeto.
- Conte a quantidade de objetos na coleção.
- Filtre carros com ano de fabricação superior a 1970.
- Exiba cada elemento no console.
- Retorne carros cujo modelo inicie com a letra C.
- Retorne se existe ao menos um carro com a letra D no modelo.
- Retorne o carro mais antigo da coleção.
- Retorne o carro mais novo da coleção.

```java
import java.util.*;
import java.util.stream.Collectors;

public class ExerciseStreams {

    public static void main(String[] args) {

//        Instancia os carros antigos para uma lista
        List<CarrosAntigos> oldCars = new ArrayList<>();

        oldCars.add(new CarrosAntigos("Brazília",1965));
        oldCars.add(new CarrosAntigos("Challenger",1967));
        oldCars.add(new CarrosAntigos("Spider",1972));
        oldCars.add(new CarrosAntigos("Camaro",1975));
        oldCars.add(new CarrosAntigos("Corvette",1973));
        oldCars.add(new CarrosAntigos("Fusca",1968));
        oldCars.add(new CarrosAntigos("Del Rey",1979));
        oldCars.add(new CarrosAntigos("Opalla",1982));

//        Transforma os objetos em uma string com seus atributos
        String oldCarsList = oldCars.toString();

        System.out.println("\nNúmero de carros antigos nesta lista: " + oldCars.stream().count());

//        Gera uma lista de carros fabricados após 1970 em ordem decrescente
//        do ano de fabricação
//
        System.out.println("\n=========================");
        System.out.println("Fabricados após 1970\n");

        List<CarrosAntigos> antigosList = oldCars.stream()
                .filter(seventiesCars -> seventiesCars.getYearManufactured() > 1970)
                .sorted(Comparator.comparing(CarrosAntigos::getYearManufactured).reversed())
                .collect(Collectors.toList());

        antigosList.forEach(System.out::println);

//        Ordena a lista pelo nome do modelo
        System.out.println("\n=========================");
        System.out.println("Carros ordenados pelo modelo\n");

        List<CarrosAntigos> antigosNomes = oldCars.stream()
                .sorted(Comparator.comparing(CarrosAntigos::getBrandCar))
                .collect(Collectors.toList());

        antigosNomes.stream()
                .forEach(System.out::println);

//        Retorna a lista de carros cujo nome começa com "c"
        System.out.println("\n=========================");
        System.out.println("Carros cujo modelo começa com \"c\", " +
                "ordenados pelo ano de fabricação\n");

        List<CarrosAntigos> nomesComC = antigosNomes.stream()
                .filter(getC -> getC.getBrandCar().toLowerCase().startsWith("c"))
                .sorted(Comparator.comparing(CarrosAntigos::getYearManufactured))
                .collect(Collectors.toList());

        nomesComC.forEach(System.out::println);

        System.out.println("\n=========================");
        System.out.println("Verifica se existe modelo de carro com \"d\"");

        System.out.println(antigosNomes.stream()
                .anyMatch(algumD -> algumD.getBrandCar().toLowerCase().contains("d")));

        System.out.println("\n=========================");
        System.out.println("Retorna o carro mais antigo e o mais novo");

        Optional<CarrosAntigos> min = antigosNomes.stream()
                .min(Comparator.comparing(CarrosAntigos::getYearManufactured));
        Optional<CarrosAntigos> max = antigosNomes.stream()
                .max(Comparator.comparing(CarrosAntigos::getYearManufactured));

        min.stream()
                .forEach(System.out::println);
        max.stream()
                .forEach(System.out::println);
    }
}


public class CarrosAntigos  {
    private final String brandCar;
    private final int yearManufactured;

    CarrosAntigos(String brand, int year) {
        this.brandCar = brand;
        this.yearManufactured = year;
    }

    @Override
    public String toString() {
        return brandCar + " " + yearManufactured;
    }

    public int getYearManufactured () {
        return yearManufactured;
    }

    public String getBrandCar() {
        return brandCar;
    }


}
```