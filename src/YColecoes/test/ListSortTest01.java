package YColecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> jogos = new ArrayList<>(6);

        jogos.add("Resident Evil 3: Nemesys");
        jogos.add("Medal of Honor");
        jogos.add("Contra");
        jogos.add("Metal Slug");
        jogos.add("Drive I");
        jogos.add("GTA III");


        Collections.sort(jogos);

        System.out.println(jogos);
    }
}
