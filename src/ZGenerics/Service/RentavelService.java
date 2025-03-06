package ZGenerics.Service;

import ZGenerics.Domonio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentavelService<T> {
    private List<T> veiculosDisponiveis;

    public RentavelService(List<T> objetoDisponiveis) {
        this.veiculosDisponiveis = objetoDisponiveis;
    }

    public T buscarVeiculosDisponiveis() {
        System.out.println("Buscando veiculo Disponivel...");
        T t = veiculosDisponiveis.remove(0);
        System.out.println("Alugando veiculo: " + t);

        System.out.println("Veiculo disponiveis para alugar: " + t);

        System.out.println(t);
        return t;
    }

    public void retornarVeiculoAlugado(T veiculo) {
        System.out.println("Devolvendo veiculo " + veiculo);
        veiculosDisponiveis.add(veiculo);
        System.out.println("Carros para alugar " );
        System.out.println(veiculosDisponiveis);
    }
}
