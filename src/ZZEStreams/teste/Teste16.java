package ZZEStreams.teste;

// 1 Ordenar todos os jogos por titulo
// 2 Retorne os primeiros 3 titulos com preço menor que 4

import ZZEStreams.dominio.Category;
import ZZEStreams.dominio.Jogos;
import ZZEStreams.dominio.Promotion;
import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Teste16 {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;

        sumFor(num);
        sumStreamIterate(num);
        sumStreamParallel(num);
        sumLongStream(num);
        sumLongStreamParallel(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum for" );
        long result = 0;
        long init = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum Stream" );
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i-> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumStreamParallel(long num) {
        System.out.println("Sum Stream parallel" );
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i-> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumLongStream(long num) {
        System.out.println("Sum LongStream" );
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumLongStreamParallel(long num) {
        System.out.println("Sum LongStream Parallel" );
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }

}
