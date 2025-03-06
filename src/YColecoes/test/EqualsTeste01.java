package YColecoes.test;

import YColecoes.Domain.Jogos;
import YColecoes.Domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class EqualsTeste01 {
    public static void main(String[] args) {
        List<Jogos> jogos = new ArrayList<>(6);

        jogos.add(new Jogos(123L, "Resident Evil 3: Nemesys", 3.50));
        jogos.add(new Jogos(546L, "Medal of Honor", 5.50));
        jogos.add(new Jogos(897L, "Contra", 5.50));
        jogos.add(new Jogos(357L, "Metal Slug", 8.50));
        jogos.add(new Jogos(549L, "Drive I", 6.50));
        jogos.add(new Jogos(146L, "GTA III", 1.50));

    }
}
