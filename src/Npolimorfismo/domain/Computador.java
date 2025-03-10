package Npolimorfismo.domain;

public class Computador extends Produto{


    public static final double IMPOSTO_POR_CENTO = 21;

    public Computador(String nome, Double valor) {
        super(nome, valor);
    }


    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
