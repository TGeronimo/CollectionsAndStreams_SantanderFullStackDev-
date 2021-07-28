package Streams;

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

        antigosNomes.stream()
                .min(Comparator.comparing(CarrosAntigos::getYearManufactured))
                .ifPresent(System.out::println); // isPresent é acessível, pois min() e max() retornam um Optional
        antigosNomes.stream()
                .max(Comparator.comparing(CarrosAntigos::getYearManufactured))
                .ifPresent(System.out::println);
    }
}
