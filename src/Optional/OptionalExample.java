package Optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente")); // usa method reference no primeiro argumento para a lambda
//        optionalString.ifPresentOrElse(valor -> System.out.println(valor,... ); // lambda sem method reference no 1° argu/o

        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println,  () -> System.out.println("null = Não está presente"));

        Optional<String> optionalEmpty = Optional.empty();
        optionalNull.ifPresentOrElse(System.out::println,  () -> System.out.println("empty = Não está presente"));

        Optional<String> optionalNullPointerException = Optional.of(null);

    }
}
