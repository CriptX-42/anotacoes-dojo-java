package YColecoes.test;

import YColecoes.Domain.Jogos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class JogosByIdComparator implements Comparator<Jogos> {

    @Override
    public int compare(Jogos o1, Jogos o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class JogosSortTeste01 {
    public static void main(String[] args) {
        List<Jogos> jogos = new ArrayList<>(6);
        JogosByIdComparator jogosByIdComparator = new JogosByIdComparator();
        jogos.add(new Jogos(123L, "Resident Evil 3: Nemesys", 3.50));
        jogos.add(new Jogos(546L, "Medal of Honor", 5.50));
        jogos.add(new Jogos(897L, "Contra", 5.50));
        jogos.add(new Jogos(357L, "Metal Slug", 8.50));
        jogos.add(new Jogos(549L, "Drive I", 6.50));
        jogos.add(new Jogos(146L, "GTA III", 1.50));




        System.out.println("Com custom sorting 2 ");
        System.out.println(" ");
        jogos.sort(jogosByIdComparator);

        Jogos buscando = new Jogos(146L, "GTA III", 1.50);

        for (Jogos jogo:  jogos) {
            System.out.println(jogo.toString());
        }
        System.out.println();

        System.out.println("Index: " +Collections.binarySearch(jogos, buscando, jogosByIdComparator));

    }
}
