package ZZHDesignPatterns.domain;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private final Set<String> cadeirasDisponiveis = new HashSet<>();
    private String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        cadeirasDisponiveis.add("1A");
        cadeirasDisponiveis.add("1B");
    }

    public boolean compraDeCardeiras (String cadeiras) {
        return cadeirasDisponiveis.remove(cadeiras);
    }
}
