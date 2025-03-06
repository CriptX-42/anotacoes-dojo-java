package ZZClambda.service;

import ZZClambda.dominio.Jogos;

public class JogosComparator {
    public static int compareByTitle(Jogos a1, Jogos a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public int compareByTitleNonStatic(Jogos a1, Jogos a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }
}
