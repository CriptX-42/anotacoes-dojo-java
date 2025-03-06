package YColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        Collections.sort(numeros);

        //Sempre a lista que queremos buscar, depois o que queremos buscar
        System.out.println("index: " + Collections.binarySearch(numeros, 2));
    }
}
