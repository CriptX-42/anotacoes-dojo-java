package YColecoes.test;

import YColecoes.Domain.Consumidor;
import YColecoes.Domain.Jogos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Ricardo");
        Consumidor consumidor2 = new Consumidor("Redragon");

        Jogos jogos3 = new Jogos(123L, "Resident Evil 3: Nemesys", 3.50, 1);
        Jogos jogos4 = new Jogos(546L, "Medal of Honor", 5.50, 2);
        Jogos jogos5 = new Jogos(897L, "Contra", 5.50, 2);
        Jogos jogos6 = new Jogos(146L, "GTA III", 1.50, 2);

        List<Jogos> mangaConsumidor1List = List.of(jogos3, jogos5, jogos6);
        List<Jogos> mangaConsumidor2List = List.of(jogos5, jogos4, jogos5);

        Map<Consumidor, List<Jogos>> consumidorJogosMap = new HashMap<>();
        consumidorJogosMap.put(consumidor1, mangaConsumidor1List);
        consumidorJogosMap.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Jogos>> entry : consumidorJogosMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " comprou: ");

            for (Jogos jogos : entry.getValue()) {
                System.out.println(jogos);
            }

        }

    }
}
