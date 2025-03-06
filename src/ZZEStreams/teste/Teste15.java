package ZZEStreams.teste;

// 1 Ordenar todos os jogos por titulo
// 2 Retorne os primeiros 3 titulos com preço menor que 4

import ZZEStreams.dominio.Category;
import ZZEStreams.dominio.Jogos;
import ZZEStreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class Teste15 {
    private static List<Jogos> listaJogos = new ArrayList<>(List.of(new Jogos("GTA", 12.3, Category.ACAO),
            new Jogos("Gran turismo", 3.55, Category.ACAO),
            new Jogos("007 Golden Eye", 2.95, Category.TIRO_PRIMEIRA_PESSOA),
            new Jogos("Contra", 6.66, Category.ACAO),
            new Jogos("DOOM", 7.11, Category.TIRO_PRIMEIRA_PESSOA),
            new Jogos("Medal of Honor", 1.99, Category.TIRO_PRIMEIRA_PESSOA),
            new Jogos("Zelda: Ocarine of the time", 1, Category.AVENTURA)));

    public static void main(String[] args) {

        //Gostariamos de agrupoar por categoria e tirar estatistica disso

        Map<Category, DoubleSummaryStatistics> collect = listaJogos.stream().collect(Collectors.groupingBy(Jogos::getCategory, Collectors.summarizingDouble(Jogos::getPrice)));

        System.out.println(collect);

        //Não se repete
        Map<Category, Set<Promotion>> collect1 = listaJogos.stream().collect(Collectors.groupingBy(Jogos::getCategory, Collectors.mapping(Teste15::getPromotion, Collectors.toSet())));

        System.out.println(collect1);

        // Mantem a ordem de inserção
        Map<Category, LinkedHashSet<Promotion>> collect2 = listaJogos.stream().collect(Collectors.groupingBy(Jogos::getCategory, Collectors.mapping(Teste15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(collect2);

    }

    private static Promotion getPromotion(Jogos jogos){
        return jogos.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRACE;
    }
}
