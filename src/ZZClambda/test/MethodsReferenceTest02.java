package ZZClambda.test;

import ZZClambda.dominio.Jogos;
import ZZClambda.service.JogosComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodsReferenceTest02 {
    public static void main(String[] args) {
        JogosComparator jogosComparator = new JogosComparator();
        List<Jogos> jogos = new ArrayList<>(List.of(new Jogos("GTA", 1),
                new Jogos("Red Dead", 3),
                new Jogos("it take two", 6)));
        jogos.sort(jogosComparator::compareByTitleNonStatic);
        System.out.println(jogos);
    }
}
