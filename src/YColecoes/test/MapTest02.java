package YColecoes.test;

import YColecoes.Domain.Consumidor;
import YColecoes.Domain.Jogos;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Ricardo");
        Consumidor consumidor2 = new Consumidor("Redragon");

        Jogos jogos3 = new Jogos(897L, "Contra", 5.50, 2);
        Jogos jogos4 = new Jogos(146L, "GTA III", 1.50, 2);

        Map<Consumidor, Jogos> consumidorJogosMap = new HashMap<>();
        consumidorJogosMap.put(consumidor1, jogos4);
        consumidorJogosMap.put(consumidor2, jogos3);

        for (Map.Entry<Consumidor, Jogos> entry : consumidorJogosMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " comprou: " + entry.getValue().getNome());
        }

    }
}
