package ZZHDesignPatterns.domain;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    //Eager Initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787");
    private final Set<String> cadeirasDisponiveis = new HashSet<>();
    private String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        cadeirasDisponiveis.add("1A");
        cadeirasDisponiveis.add("1B");
    }

    public boolean compraDeCardeiras (String cadeiras) {
        return cadeirasDisponiveis.remove(cadeiras);
    }

    public static AircraftSingletonEager getInstance() {
        return INSTANCE;
    }
}
