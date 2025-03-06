package ZZHDesignPatterns.test;

import ZZHDesignPatterns.domain.Aircraft;
import ZZHDesignPatterns.domain.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {

        comprarCadeiras("1A");
        comprarCadeiras("1A");
    }

    public static void  comprarCadeiras(String cadeiras) {
        AircraftSingletonEager instance = AircraftSingletonEager.getInstance();
        System.out.println(instance.compraDeCardeiras(cadeiras));
    }
}
