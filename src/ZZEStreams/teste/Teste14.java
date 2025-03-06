package ZZEStreams.teste;

// 1 Ordenar todos os jogos por titulo
// 2 Retorne os primeiros 3 titulos com preço menor que 4

import ZZEStreams.dominio.Category;
import ZZEStreams.dominio.Jogos;
import ZZEStreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class Teste14 {
    private static List<Jogos> listaJogos = new ArrayList<>(List.of(new Jogos("GTA", 12.3, Category.ACAO),
            new Jogos("Gran turismo", 3.55, Category.ACAO),
            new Jogos("007 Golden Eye", 2.95, Category.TIRO_PRIMEIRA_PESSOA),
            new Jogos("Contra", 6.66, Category.ACAO),
            new Jogos("DOOM", 7.11, Category.TIRO_PRIMEIRA_PESSOA),
            new Jogos("Medal of Honor", 1.99, Category.TIRO_PRIMEIRA_PESSOA),
            new Jogos("Zelda: Ocarine of the time", 1, Category.AVENTURA)));

    public static void main(String[] args) {

        Map<Category, Long> collect = listaJogos.stream().collect(Collectors.groupingBy(Jogos::getCategory, Collectors.counting()));

        System.out.println(collect);
        Map<Category, Optional<Jogos>> collect1 = listaJogos.stream().collect(Collectors.groupingBy(Jogos::getCategory, Collectors.maxBy(Comparator.comparing(Jogos::getPrice))));
        System.out.println(collect1);

        Map<Category, Jogos> collect2 = listaJogos.stream().collect(Collectors.groupingBy(Jogos::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Jogos::getPrice)), Optional::get)));

        System.out.println(collect2);
    }
}
