package Optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalPrimitiveExample {
    public static void main(String[] args) {
        OptionalInt.of(99).ifPresent(System.out::println);

        OptionalDouble.of(99.9D).ifPresent(System.out::println);

        OptionalLong.of(99L).ifPresent(System.out::println);




    }
}
