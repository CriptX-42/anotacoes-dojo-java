package YColecoes.test;

import YColecoes.Domain.Jogos;
import YColecoes.Domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class JogosPrecoComparator implements Comparator <Jogos> {
    @Override
    public int compare(Jogos o1, Jogos o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }

}
public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Jogos> jogos = new TreeSet<>(new JogosPrecoComparator());
        jogos.add(new Jogos(123L, "Resident Evil 3: Nemesys", 3.50, 1));
        jogos.add(new Jogos(546L, "Medal of Honor", 5.50, 2));
        jogos.add(new Jogos(897L, "Contra", 5.50, 2));
        jogos.add(new Jogos(357L, "Metal Slug", 8.50, 2));
        jogos.add(new Jogos(357L, "Metal Slug", 8.50, 2));
        jogos.add(new Jogos(549L, "Drive I", 6.50, 2));
        jogos.add(new Jogos(146L, "GTA III", 1.50, 2));

        Jogos mario = new Jogos(5L, "Mario", 5.50, 2);
        System.out.println(jogos.ceiling(mario));
        System.out.println(jogos.pollFirst());
        System.out.println(jogos.pollLast());
    }
}
