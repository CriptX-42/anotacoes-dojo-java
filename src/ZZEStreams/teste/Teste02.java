package ZZEStreams.teste;

// 1 Ordenar todos os jogos por titulo
// 2 Retorne os primeiros 3 titulos com preço menor que 4

import ZZEStreams.dominio.Jogos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste02 {
    private static List<Jogos> listaJogos = new ArrayList<>(List.of(new Jogos("GTA", 12.3),
            new Jogos("Gran turismo", 3.55),
            new Jogos("007 Golden Eye", 2.95),
            new Jogos("Contra", 6.66),
            new Jogos("DOOM", 7.11),
            new Jogos("Medal of Honor", 1.99),
            new Jogos("Zelda: Ocarine of the time", 1)));

    public static void main(String[] args) {
        listaJogos.sort(Comparator.comparing(Jogos::getNome));
        List<String> list = listaJogos.stream()
                .sorted(Comparator.comparing(Jogos::getNome))
                .filter(lista -> lista.getPrice() <= 4)
                .limit(3)
                .map(Jogos::getNome)
                .toList();

        System.out.println(listaJogos);
        System.out.println(list);

    }
}
