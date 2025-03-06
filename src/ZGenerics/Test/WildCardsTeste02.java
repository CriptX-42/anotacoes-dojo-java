package ZGenerics.Test;


import java.util.List;

public class WildCardsTeste02 {

    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printCunsulta(cachorros);
    }
    private static void printCunsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void adicionaAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());

    }
}
