package ZZEStreams.teste;

// 1 Ordenar todos os jogos por titulo
// 2 Retorne os primeiros 3 titulos com preço menor que 4

import ZZEStreams.dominio.Jogos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Teste11 {
    private static List<Jogos> listaJogos = new ArrayList<>(List.of(new Jogos("GTA", 12.3),
            new Jogos("Gran turismo", 3.55),
            new Jogos("007 Golden Eye", 2.95),
            new Jogos("Contra", 6.66),
            new Jogos("DOOM", 7.11),
            new Jogos("Medal of Honor", 1.99),
            new Jogos("Zelda: Ocarine of the time", 1)));

    public static void main(String[] args) {

        listaJogos.stream().max(Comparator.comparing(Jogos::getPrice)).ifPresent(System.out::println);
        listaJogos.stream().collect(Collectors.maxBy(Comparator.comparing(Jogos::getPrice))).ifPresent(System.out::println);

        System.out.println(listaJogos.stream().mapToDouble(Jogos::getPrice).sum());
        System.out.println(listaJogos.stream().collect(Collectors.summarizingDouble(Jogos::getPrice)));
    }
}
