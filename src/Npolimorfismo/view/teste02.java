package Npolimorfismo.view;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class teste02 {
    public static void main(String[] args) {
        Computador computador = new Computador("Predator", 2000.00);
        Tomate tomate = new Tomate("Tumate", 20.00);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(computador);
    }
}
