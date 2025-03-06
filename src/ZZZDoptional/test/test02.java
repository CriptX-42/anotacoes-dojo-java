package ZZZDoptional.test;

import ZZZDoptional.dominio.Jogos;
import ZZZDoptional.repositorio.JogosRepository;

import java.util.Optional;

public class test02 {
    public static void main(String[] args) {
        Optional<Jogos> jogoPorTitulo = JogosRepository.findByTitle("GTA II");
        jogoPorTitulo.ifPresent(j -> j.setTitle("GTA III"));
        jogoPorTitulo.ifPresent(j -> System.out.println(j));

        Jogos jogoPorId = JogosRepository.findById(1).orElseThrow(IllegalArgumentException::new);
        System.out.println(jogoPorId);

        Jogos findByTitle = JogosRepository.findByTitle("DayZ")
                .orElseGet(() -> new Jogos(3, "DayZ", 20));

        System.out.println(jogoPorId);

    }
}
