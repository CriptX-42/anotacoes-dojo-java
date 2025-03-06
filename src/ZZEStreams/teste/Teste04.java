package ZZEStreams.teste;

// 1 Ordenar todos os jogos por titulo
// 2 Retorne os primeiros 3 titulos com preço menor que 4

import ZZEStreams.dominio.Jogos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Teste04 {


    public static void main(String[] args) {
        List<List<String>> faculdade = new ArrayList<>();
        List<String> cursoProgramacao = List.of("Ricardo", "Lucas Almeida", "Rafael Oliveira", "Fernanda Lima");
        List<String> cursoEngenharia = List.of("Bruno Nogueira", "Amanda Silveira", "Juliana Rocha", "Eduardo Martins");
        List<String> cursoMatematica = List.of("Thiago Moreira", "Vanessa Carvalho", "Felipe Andrade", "Larissa Souza");

        faculdade.add(cursoProgramacao);
        faculdade.add(cursoEngenharia);
        faculdade.add(cursoMatematica);

        faculdade.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
