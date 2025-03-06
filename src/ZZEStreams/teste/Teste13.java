package ZZEStreams.teste;

// 1 Ordenar todos os jogos por titulo
// 2 Retorne os primeiros 3 titulos com preço menor que 4

import ZZEStreams.dominio.Category;
import ZZEStreams.dominio.Jogos;
import ZZEStreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Teste13 {
    private static List<Jogos> listaJogos = new ArrayList<>(List.of(new Jogos("GTA", 12.3, Category.ACAO),
            new Jogos("Gran turismo", 3.55, Category.ACAO),
            new Jogos("007 Golden Eye", 2.95, Category.TIRO_PRIMEIRA_PESSOA),
            new Jogos("Contra", 6.66, Category.ACAO),
            new Jogos("DOOM", 7.11, Category.TIRO_PRIMEIRA_PESSOA),
            new Jogos("Medal of Honor", 1.99, Category.TIRO_PRIMEIRA_PESSOA),
            new Jogos("Zelda: Ocarine of the time", 1, Category.AVENTURA)));

    public static void main(String[] args) {

        Map<Promotion, Map<Category, List<Jogos>>> collect = listaJogos.stream()
                .collect(
                        Collectors.groupingBy(listaJogo -> listaJogo.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRACE, Collectors.groupingBy(Jogos::getCategory)));


        System.out.println(collect);
    }
}
