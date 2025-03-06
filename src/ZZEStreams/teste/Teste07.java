package ZZEStreams.teste;

import java.util.List;

public class Teste07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9);

        integers.stream().reduce((x,y) -> x+y )
                .ifPresent(System.out::println);

        //Com valor inicial
        Integer initialValueWithReduce = integers.stream()
                .reduce(1, (x, y) -> x + y);
        System.out.println(initialValueWithReduce);

        //Uma soma mais simples
        Integer simple = integers.stream().reduce(0, Integer::sum);
        System.out.println(simple);
    }
}
