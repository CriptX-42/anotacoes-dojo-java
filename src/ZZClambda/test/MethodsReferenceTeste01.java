package ZZClambda.test;

import ZZClambda.dominio.Jogos;
import ZZClambda.service.JogosComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsReferenceTeste01 {
    public static void main(String[] args) {
        List<Jogos> jogos = new ArrayList<>(List.of(new Jogos("GTA", 1),
                new Jogos("Red Dead", 3),
                new Jogos("it take two", 6)));
        Collections.sort(jogos, JogosComparator::compareByTitle);
        System.out.println(jogos);
    }
}

