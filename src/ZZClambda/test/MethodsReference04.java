package ZZClambda.test;

import ZZClambda.dominio.Jogos;
import ZZClambda.service.JogosComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MethodsReference04 {
    public static void main(String[] args) {
        Supplier<JogosComparator> newJogosComparator = JogosComparator::new;
        JogosComparator jogosComparator = newJogosComparator.get(); // aqui é a instancia
        List<Jogos> jogos = new ArrayList<>(List.of(new Jogos("GTA", 1),
                new Jogos("Red Dead", 3),
                new Jogos("it take two", 6)));

        jogos.sort(jogosComparator::compareByTitleNonStatic);

        System.out.println(jogos);

    }
}
