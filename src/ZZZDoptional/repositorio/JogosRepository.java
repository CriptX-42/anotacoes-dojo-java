package ZZZDoptional.repositorio;

import ZZZDoptional.dominio.Jogos;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class JogosRepository {
    private static List<Jogos> jogos = List.of(new Jogos(1, "GTA II", 3), new Jogos(2, "The sims", 1), new Jogos(1, "Contra", 10));

    public static Optional<Jogos>  findByTitle(String title) {
        return findBy(j -> j.getTitle().equals(title));
    }

    public static Optional<Jogos>  findById(Integer id) {
        return findBy(j -> j.getId().equals(id));
    }

    public static Optional<Jogos>  findBy(Predicate<Jogos> predicate) {
        Jogos found = null;
        for(Jogos jogo: jogos) {
            if(predicate.test(jogo)) {
                found = jogo;
            }
        }
        return Optional.ofNullable(found);
    }
}
