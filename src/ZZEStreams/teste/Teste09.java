package ZZEStreams.teste;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Teste09 {
    public static void main(String[] args) {
        IntStream.range(1,50).filter(n -> n % 2 ==0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.rangeClosed(1,50).filter(n -> n % 2 ==0).forEach(n -> System.out.print(n + " " ));

        System.out.println();
        Stream.of("Oi", "Eu", "Sou", "Ricardo")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));


    }
}
