package ZGenerics.Test;

abstract class Animal {
    abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal {
    @Override
    void consulta() {
        System.out.println("Consultando Gato");
    }
}

public class WildCardsTeste01 {

    public static void main(String[] args) {
         Cachorro[] cachorro = {new Cachorro(), new Cachorro()};
         Gato[] gato = {new Gato(), new Gato()};
        printCunsulta(cachorro);
        printCunsulta(gato);

    }
    private static void printCunsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

        animals[1] = new Gato();

    }
}
