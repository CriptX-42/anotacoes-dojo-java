package ZGenerics.Test;

import ZGenerics.Domonio.Barco;
import ZGenerics.Domonio.Carro;
import ZGenerics.Service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("BMW"), new Carro("Nissan")));

        RentavelService<Carro> rentavelServiceCarro = new RentavelService<>(carrosDisponiveis);

        Carro carro = rentavelServiceCarro.buscarVeiculosDisponiveis();
        System.out.println("Usando carro por 1 mês...");
        rentavelServiceCarro.retornarVeiculoAlugado(carro);

    }
}
