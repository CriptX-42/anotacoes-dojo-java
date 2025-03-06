package ZZClambda.test;

import ZZClambda.dominio.Jogos;
import ZZClambda.service.JogosComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodsReferenceTest03 {
    public static void main(String[] args) {
        JogosComparator jogosComparator = new JogosComparator();
        List<String> strings = new ArrayList<>(List.of("Ricardo", "Carvalho"));
        strings.sort(String::compareTo);
        System.out.println(strings);
    }
}
