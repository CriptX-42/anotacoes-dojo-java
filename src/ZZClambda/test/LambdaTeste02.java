package ZZClambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTeste02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Ricardo", "Carvalho");
        List<Integer> integers = map(strings, String::length);
        System.out.println(integers);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e: list) {
            R r = function.apply(e);
            result.add(r);
        }
        return  result;
    }
}
