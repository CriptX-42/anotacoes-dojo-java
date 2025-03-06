package ZZClambda.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Ricardo", "Luiz", "José");
        forEach(strings, (String s) -> System.out.println(s));
    }
    
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
