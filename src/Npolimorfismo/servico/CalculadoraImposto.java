package Npolimorfismo.servico;

import Npolimorfismo.domain.Produto;
import Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    // se não tiver acessando nenhum atributo de classe vc pode transformar os métodos em estatico
    // para não estanciarmos na view


    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Computador" + produto.getNome());
        System.out.println("Valor do produto"  + " " + produto.getValor());
        System.out.println("Imposto a ser pago"  + " " + imposto);

        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade() +" validade");
        }
    }
}
