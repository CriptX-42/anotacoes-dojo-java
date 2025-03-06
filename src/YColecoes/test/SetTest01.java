package YColecoes.test;

import YColecoes.Domain.Jogos;

import java.util.*;

public class SetTest01 {

    public static void main(String[] args) {
        Set<Jogos> jogos = new HashSet<>();
        JogosByIdComparator jogosByIdComparator = new JogosByIdComparator();
        jogos.add(new Jogos(123L, "Resident Evil 3: Nemesys", 3.50, 1));
        jogos.add(new Jogos(546L, "Medal of Honor", 5.50, 2));
        jogos.add(new Jogos(897L, "Contra", 5.50, 2));
        jogos.add(new Jogos(357L, "Metal Slug", 8.50, 2));
        jogos.add(new Jogos(357L, "Metal Slug", 8.50, 2));
        jogos.add(new Jogos(549L, "Drive I", 6.50, 2));
        jogos.add(new Jogos(146L, "GTA III", 1.50, 2));


        for (Jogos jogo:  jogos) {
            System.out.println(jogo);
        }
    }
}
