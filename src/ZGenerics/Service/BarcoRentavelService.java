package ZGenerics.Service;

import ZGenerics.Domonio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(
            List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscarCarroDisponivel() {
        System.out.println("Buscando Barco Disponivel...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);

        System.out.println("Barco disponiveis para alugar: " + barco);

        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarCarroAlugado(Barco barco) {
        System.out.println("Devolvendo barco " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Carros para alugar " );
        System.out.println(barcosDisponiveis);


    }
}
